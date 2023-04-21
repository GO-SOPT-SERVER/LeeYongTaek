package sopt.org.SecondSeminar.service;

import org.springframework.stereotype.Service;
import sopt.org.SecondSeminar.dto.request.RegisterRequestDto;
import sopt.org.SecondSeminar.domain.User;

import static sopt.org.SecondSeminar.SecondSeminarApplication.userList;

@Service
public class UserService {
    public Long register(RegisterRequestDto request) {

        // 받아온 request 데이터를 토대로 실제 User 객체 생성
        User newUser = new User(
                request.getGender(),
                request.getName(),
                request.getContact(),
                request.getAge()
        );

        // 데이터베이스에 저장
        userList.add(newUser);
        newUser.setId((long) userList.size());

        // 저장한 유저 아이디 값 반환
        return newUser.getId();
    }

    public User getUser(Long userId) {
        int index = userId.intValue()-1;
        User user = userList.get(index);

        return user;
    }

    public User searchUser(String name) {
        return userList.stream()
                .filter(post -> post.getName().equals(name))
                .findFirst()
                .orElseThrow(()-> new RuntimeException("User가 없습니다"));
    }
}
