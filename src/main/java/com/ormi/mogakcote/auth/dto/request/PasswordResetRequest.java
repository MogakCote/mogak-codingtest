package com.ormi.mogakcote.auth.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PasswordResetRequest {

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String code;
}
