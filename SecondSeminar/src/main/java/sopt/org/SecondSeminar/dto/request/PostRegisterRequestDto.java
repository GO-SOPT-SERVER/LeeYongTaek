package sopt.org.SecondSeminar.dto.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PostRegisterRequestDto {
    private String title;
    private String content;
}
