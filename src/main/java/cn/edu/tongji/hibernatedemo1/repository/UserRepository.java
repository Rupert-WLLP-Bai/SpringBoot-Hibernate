package cn.edu.tongji.hibernatedemo1.repository;

import cn.edu.tongji.hibernatedemo1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByName(String name);
}
