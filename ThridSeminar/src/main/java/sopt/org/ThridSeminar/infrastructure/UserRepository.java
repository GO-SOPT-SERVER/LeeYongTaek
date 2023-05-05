package sopt.org.ThridSeminar.infrastructure;

import org.springframework.data.repository.Repository;
import sopt.org.ThridSeminar.domain.User;

public interface UserRepository extends Repository<User, Long> {
    void save(User user);
}