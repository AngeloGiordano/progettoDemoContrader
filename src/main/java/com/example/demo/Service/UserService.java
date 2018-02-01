package com.example.demo.Service;

import com.example.demo.Dao.UserRepository;
import com.example.demo.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public  User insert (User user) {
        return this.userRepository.save(user);
    }

    public List<User> findByRuolo(String ruolo) {
        return this.userRepository.findByRuolo(ruolo);
    }

    public User findByUsername (String username){return this.userRepository.findByUsername(username);}

}
