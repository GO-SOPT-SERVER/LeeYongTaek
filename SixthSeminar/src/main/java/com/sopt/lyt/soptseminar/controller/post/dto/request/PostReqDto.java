package com.sopt.lyt.soptseminar.controller.post.dto.request;

import javax.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class PostReqDto {
    @NotBlank
    private String title;
    @NotBlank
    private String content;
}
