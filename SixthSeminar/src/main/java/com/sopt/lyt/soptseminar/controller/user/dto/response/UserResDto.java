package com.sopt.lyt.soptseminar.controller.user.dto.response;

import com.sopt.lyt.soptseminar.domian.User;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserResDto {
    private Long id;
    private String nickname;

    public static UserResDto to(User user) {
        return new UserResDto(user.getId(), user.getNickname());
    }
}
