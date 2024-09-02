package com.ormi.mogakcote.user.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ormi.mogakcote.user.domain.Authority;
import lombok.Data;

// Register에 권한이 없어서 혹시나 하고 새로 만든 request
@Data
public class UserAuthRequest {
    private String username;
    private String email;
    private String password;
    @JsonProperty("confirmPassword")
    private String confirmPassword;
    private String nickname;
    private Authority authority;
}
