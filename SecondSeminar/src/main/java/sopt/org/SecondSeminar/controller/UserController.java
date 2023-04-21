package sopt.org.SecondSeminar.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sopt.org.SecondSeminar.domain.User;
import sopt.org.SecondSeminar.dto.request.RegisterRequestDto;
import sopt.org.SecondSeminar.service.UserService;

import static sopt.org.SecondSeminar.SecondSeminarApplication.userList;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/user")
    public String register(@RequestBody final RegisterRequestDto request) {

        // 서비스 계층에 유저를 등록하는 메서드를 호출
        Long userId = userService.register(request);
        System.out.println(userList.get(userId.intValue() - 1).toString());

        return userId + "번 유저가 등록되었습니다!";
    }

    @GetMapping("/user/{userId}")
    public String getOne(@PathVariable final Long userId) {
        System.out.println("요청 유저 아이디: " + userId);

        User user = userService.getUser(userId);

        System.out.println("이름: " + user.getName());
        System.out.println("나이" + user.getAge());
        System.out.println("전화번호" + user.getContact());
        System.out.println("성별" + user.getGender());

        return "유저 조회 성공";
    }

    @GetMapping("/user/search")
    public String search(@RequestParam final String name) {
        System.out.println("유저 이름 검색 인자: " + name);

        User user = userService.searchUser(name);

        System.out.println("이름: " + user.getName());
        System.out.println("나이" + user.getAge());
        System.out.println("전화번호" + user.getContact());
        System.out.println("성별" + user.getGender());

        return "유저 검색 성공";
    }
}