package com.ormi.mogakcote.problem.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlatformResponse {
    private Long id;
    private String platformName;

    public static PlatformResponse toResponse(Long platformId, String platformName){
        return new PlatformResponse(platformId, platformName);
    }
}
