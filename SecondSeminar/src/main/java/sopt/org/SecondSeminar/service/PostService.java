package sopt.org.SecondSeminar.service;

import org.springframework.stereotype.Service;
import sopt.org.SecondSeminar.domain.Post;
import sopt.org.SecondSeminar.dto.request.PostRegisterRequestDto;

import static sopt.org.SecondSeminar.SecondSeminarApplication.postList;

@Service
public class PostService {
    public Long register(PostRegisterRequestDto request) {

        Post newPost = new Post(
                request.getTitle(),
                request.getContent()
        );

        postList.add(newPost);
        newPost.setId((long) postList.size());

        return newPost.getId();
    }

    public Post getPost(Long postId) {
        int index = postId.intValue()-1;
        Post post = postList.get(index);

        return post;
    }

    public Post searchPost(String title) {
        return postList.stream()
                .filter(post -> post.getTitle().equals(title))
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Post가 없습니다"));
    }

}
