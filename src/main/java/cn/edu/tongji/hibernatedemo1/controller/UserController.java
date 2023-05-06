package cn.edu.tongji.hibernatedemo1.controller;

import cn.edu.tongji.hibernatedemo1.entity.User;
import cn.edu.tongji.hibernatedemo1.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
