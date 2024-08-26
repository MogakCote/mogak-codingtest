package com.ormi.mogakcote.comment.application;

import com.ormi.mogakcote.auth.model.AuthUser;
import com.ormi.mogakcote.comment.domain.Comment;
import com.ormi.mogakcote.comment.dto.request.CommentRequest;
import com.ormi.mogakcote.comment.dto.response.CommentResponse;
import com.ormi.mogakcote.comment.infrastructure.CommentRepository;
import com.ormi.mogakcote.common.dto.SuccessResponse;
import com.ormi.mogakcote.exception.auth.AuthInvalidException;
import com.ormi.mogakcote.exception.comment.CommentInvalidException;
import com.ormi.mogakcote.exception.dto.ErrorType;
import com.ormi.mogakcote.exception.post.PostInvalidException;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
//    private final PostRepository postRepository;

    /**
     * 답변 생성
     */
    @Transactional
    public CommentResponse createComment(AuthUser user, Long postId, CommentRequest request) {
        isExistPostById(postId);

        String nickname = "tester"; // TODO user 정보 등록

        Comment comment = buildComment(request, user.getId(), postId);
        Comment savedComment = commentRepository.save(comment);

        return CommentResponse.toResponse(
                savedComment.getId(),
                nickname,
                savedComment.getContent(),
                savedComment.getCreatedAt()
        );
    }

    /**
     * 답변 조회
     */
    @Transactional(readOnly = true)
    public CommentResponse getComment(Long postId, Long commentId) {
        isExistPostById(postId);

        Comment findComment = getCommentById(commentId);

        String nickname = "tester"; // TODO user 정보 등록

        return CommentResponse.toResponse(
                findComment.getId(),
                nickname,
                findComment.getContent(),
                findComment.getCreatedAt()
        );
    }

    /**
     * 답변 수정
     */
    @Transactional
    public CommentResponse editComment(AuthUser user, Long postId, Long commentId, CommentRequest request) {
        isExistPostById(postId);

        String nickname = "tester";   // TODO user 정보

        Comment findComment = getCommentById(commentId);

        validateSameUser(findComment.getUserId(), user.getId());

        findComment.update(
                request.getContent()
        );

        return CommentResponse.toResponse(
                findComment.getId(),
                nickname,
                findComment.getContent(),
                findComment.getCreatedAt()
        );
    }

    /**
     * 답변 삭제
     */
    @Transactional
    public SuccessResponse deleteComment(AuthUser user, Long postId, Long commentId) {
        isExistPostById(postId);

        Comment findComment = getCommentById(commentId);

        validateSameUser(findComment.getUserId(), user.getId());

        commentRepository.deleteById(findComment.getId());

        return new SuccessResponse("답변 삭제를 성공했습니다.");
    }

    /**
     * 답변 전체 목록
     */
    public List<CommentResponse> getCommentList(Long postId) {
        isExistPostById(postId);

        List<CommentResponse> commentResponses = new ArrayList<>();
        List<Comment> findComments = commentRepository.findAllByPostId(postId);

        String nickname = "tester"; // TODO user 정보 등록

        findComments.forEach(findComment -> {
            commentResponses.add(CommentResponse.toResponse(
                    findComment.getId(),
                    nickname,
                    findComment.getContent(),
                    findComment.getCreatedAt()
            ));
        });

        return commentResponses;
    }

    private void isExistPostById(Long postId) {
//        postRepository.existsById(postId).orElseThrow(    // TODO post 등록 이후 메서드 추가
//                () -> new PostInvalidException(ErrorType.POST_NOT_FOUND_ERROR)
//        );
    }

    private static Comment buildComment(CommentRequest request, Long userId, Long postId) {
        return Comment.builder()
                .content(request.getContent())
                .userId(userId)
                .postId(postId)
                .build();
    }

    private Comment getCommentById(Long commentId) {
        return commentRepository.findById(commentId).orElseThrow(
                () -> new CommentInvalidException(ErrorType.COMMENT_NOT_FOUND_ERROR)
        );
    }

    private static void validateSameUser(Long commentUserId, Long userId) {
        if (!commentUserId.equals(userId)) {
            throw new AuthInvalidException(ErrorType.NON_IDENTICAL_USER_ERROR);
        }
    }
}
