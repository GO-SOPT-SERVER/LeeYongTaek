package sopt.org.ThridSeminar.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sopt.org.ThridSeminar.controller.dto.ApiResponseDto;
import sopt.org.ThridSeminar.controller.dto.request.UserRequestDto;
import sopt.org.ThridSeminar.exception.SuccessStatus;
import sopt.org.ThridSeminar.service.UserService;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user/signup")
    public ApiResponseDto create(@RequestBody @Valid final UserRequestDto request) {
        return ApiResponseDto.success(SuccessStatus.SIGNUP_SUCCESS, userService.create(request));
    }
}
