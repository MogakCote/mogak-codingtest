package com.ormi.mogakcote.exception.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorType {

    CONFLICT_ERROR(HttpStatus.BAD_REQUEST, "예기치 못한 에러가 발생했습니다."),

    // Fast API 예외
    FAST_API_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "FastAPI 서버 오류가 발생했습니다."),
    FAST_API_CALL_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "FastAPI 호출 중 예상치 못한 오류가 발생했습니다."),

    // rate-limit 예외
    RATE_LIMIT_EXCEEDED_ERROR(HttpStatus.TOO_MANY_REQUESTS, "요청 횟수가 제한을 초과했습니다."),
    DAILY_RATE_LIMIT_EXCEEDED_ERROR(HttpStatus.TOO_MANY_REQUESTS, "일일 요청 횟수가 제한을 초과했습니다."),
    PER_SECOND_RATE_LIMIT_EXCEEDED_ERROR(HttpStatus.TOO_MANY_REQUESTS, "초당 요청 횟수가 제한을 초과했습니다."),

    // problem 예외
    LANGUAGE_NOT_FOUND_ERROR(HttpStatus.NOT_FOUND, "id 에 맞는 언어가 존재하지 않습니다."),
    ALGORITHM_NOT_FOUND_ERROR(HttpStatus.NOT_FOUND, "id 에 맞는 알고리즘이 존재하지 않습니다."),
    PLATFORM_NOT_FOUND_ERROR(HttpStatus.NOT_FOUND, "id 에 맞는 플랫폼이 존재하지 않습니다."),
    PROBLEM_NOT_FOUND_ERROR(HttpStatus.NOT_FOUND, "요구에 맞는 문제가 존재하지 않습니다. 플랫폼과 문제 번호를 확인해주세요."),

    // post 예외
    POST_NOT_FOUND_ERROR(HttpStatus.NOT_FOUND, "게시글을 찾을 수 없습니다."),

    // comment 예외
    COMMENT_NOT_FOUND_ERROR(HttpStatus.NOT_FOUND, "댓글을 찾을 수 없습니다."),

    // auth 예외
    NON_IDENTICAL_USER_ERROR(HttpStatus.BAD_REQUEST, "작성자와 접근자가 동일하지 않습니다."),
    WRONG_PASSWORD_ERROR(HttpStatus.UNAUTHORIZED, "잘못된 비밀번호입니다"),
    INVALID_ACCESS_TOKEN_ERROR(HttpStatus.FORBIDDEN, "잘못된 액세스 토큰입니다"),
    USED_ACCESS_TOKEN_ERROR(HttpStatus.FORBIDDEN, "이미 사용된 엑세스 토큰입니다"),
    USED_REFRESH_TOKEN_ERROR(HttpStatus.FORBIDDEN, "이미 사용된 리프레시 토큰입니다"),
    REFRESH_ACCESS_TOKEN_NOT_MATCH_ERROR(HttpStatus.FORBIDDEN, "엑세스 토큰이 일치하지 않습니다"),
    ONLY_ADMIN_AUTHORITY_ERROR(HttpStatus.BAD_REQUEST, "관리자 권한이 필요한 기능입니다."),
    RESET_PASSWORD_CODE_NOT_MATCH_ERROR(HttpStatus.BAD_REQUEST, "초기화 코드가 일치하지 않습니다"),
    INVALID_AUTH_CHANGE_ERROR(HttpStatus.FORBIDDEN,"사용자의 권한을 변경 할 수 없습니다."),

    // notice 예외
    NOTICE_NOT_FOUND_ERROR(HttpStatus.NOT_FOUND, "공지사항을 찾을 수 없습니다."),

    // user 예외
    USER_NOT_FOUND_ERROR(HttpStatus.NOT_FOUND, "유저를 찾을 수 없습니다"),
    SYSTEM_USER_NOT_FOUND_ERROR(HttpStatus.NOT_FOUND, "시스템 유저를 찾을 수 없습니다."),
    PASSWORD_NOT(HttpStatus.BAD_REQUEST, "패스워드가 확인 패스워드랑 일치하지 않습니다."),

    // news 예외
    NOT_RECEIVER_ERROR(HttpStatus.BAD_REQUEST, "알림 수신자가 아닙니다."),
    NEWS_NOT_FOUND_ERROR(HttpStatus.NOT_FOUND, "id 에 맞는 알림이 존재하지 않습니다."),

    // badge 예외
    BADGE_NOT_FOUND_ERROR(HttpStatus.NOT_FOUND, "뱃지를 찾을 수 없습니다");

    private final HttpStatus status;
    private final String message;
}
