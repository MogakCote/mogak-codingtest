package com.ormi.mogakcote.post.presentation;

import com.ormi.mogakcote.auth.model.AuthUser;
import com.ormi.mogakcote.post.dto.request.PostRequest;
import com.ormi.mogakcote.post.application.PostService;
import com.ormi.mogakcote.post.dto.response.PostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostViewController {

    private final PostService postService;

    @GetMapping
    public String listPosts(Model model) {
        List<PostResponse> posts = postService.getAllPosts();
        model.addAttribute("posts", posts);
        return "post/list";
    }

    @GetMapping("/{postId}")
    public String viewPost(@PathVariable Long postId, Model model) {
        PostResponse post = postService.getPost(postId);
        model.addAttribute("post", post);
        return "post/view";
    }

    @GetMapping("/new")
    public String showPostForm(Model model) {
        model.addAttribute("postRequest", new PostRequest());
        return "post-create";
    }

    @PostMapping
    public String createPost(AuthUser user, @ModelAttribute PostRequest request) {
        postService.createPost(user, request);
        return "redirect:/post";
    }

    @GetMapping("/{postId}/edit")
    public String showEditForm(@PathVariable Long postId, Model model) {
        PostResponse postResponse = postService.getPost(postId);
        PostRequest postRequest = new PostRequest();

        // PostResponse에서 PostRequest로 데이터 복사
        postRequest.setTitle(postResponse.getTitle());
        postRequest.setContent(postResponse.getContent());
        postRequest.setPlatformId(postResponse.getPlatformId());
        postRequest.setProblemNumber(postResponse.getProblemNumber());
        postRequest.setAlgorithmId(postResponse.getAlgorithmIds()); // 주의: 필드명 불일치
        postRequest.setLanguageId(postResponse.getLanguageId());
        postRequest.setCode(postResponse.getCode());
        postRequest.setPublic(postResponse.isPublic());
        postRequest.setReportRequested(postResponse.isReportRequested());

        model.addAttribute("postRequest", postRequest);
        model.addAttribute("platforms", postService.getAllPlatforms());
        model.addAttribute("languages", postService.getAllLanguages());
        model.addAttribute("algorithms", postService.getAllAlgorithms());
        return "post/edit";
    }

    @PostMapping("/{postId}")
    public String updatePost(AuthUser user, @PathVariable Long postId, @ModelAttribute PostRequest request) {
        postService.updatePost(user, postId, request);
        return "redirect:/post/" + postId;
    }

    @PostMapping("/{postId}/delete")
    public String deletePost(AuthUser user, @PathVariable Long postId) {
        postService.deletePost(user, postId);
        return "redirect:/post";
    }
}