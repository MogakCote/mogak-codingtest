package com.ormi.mogakcote.post.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostSearchRequest {
	private String keyword;
	private String algorithm;
	private String language;
	@JsonProperty("checkSuccess")
	private boolean checkSuccess;
	private SortType sortBy = SortType.LATEST;
	private Integer page = 1;
}
