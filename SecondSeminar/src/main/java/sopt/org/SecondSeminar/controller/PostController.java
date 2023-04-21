package sopt.org.SecondSeminar.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sopt.org.SecondSeminar.domain.Post;
import sopt.org.SecondSeminar.dto.request.PostRegisterRequestDto;
import sopt.org.SecondSeminar.service.PostService;

import static sopt.org.SecondSeminar.SecondSeminarApplication.postList;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;
    @PostMapping("/post")
    public String register(@RequestBody final PostRegisterRequestDto request) {

        Long postId = postService.register(request);
        System.out.println(postList.get(postId.intValue() - 1).toString());

        return postId + "번 포스트가 등록되었습니다!";
    }

    @GetMapping("/post/{postId}")
    public String getOne(@PathVariable final Long postId) {
        System.out.println("게시물 아이디: " + postId);

        Post post = postService.getPost(postId);

        System.out.println(post.getTitle());
        System.out.println(post.getContent());

        return "포스트 조회 성공";
    }

    @GetMapping("/post/search")
    public String search(@RequestParam final String name) {

        System.out.println("포스트 이름 검색 인자: " + name);

        Post post = postService.searchPost(name);

        System.out.println("제목: " + post.getTitle());
        System.out.println("내용: " + post.getContent());

        return "포스트 검색 성공";
    }
}
