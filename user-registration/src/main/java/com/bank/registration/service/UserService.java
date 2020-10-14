package com.bank.registration.service;

import com.bank.registration.entity.User;
import com.bank.registration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User register(User user){
        return userRepository.save(user);
    }

    public Optional<User> getUserProfile(Long userName){
        return userRepository.findById(userName);
    }

}
