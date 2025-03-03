package com.dio.bootcamp_dio_java.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.dio.bootcamp_dio_java.domain.model.User;
import com.dio.bootcamp_dio_java.domain.repository.UserRepository;
import com.dio.bootcamp_dio_java.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
      return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This account number already exists");
        }
        return userRepository.save(userToCreate);
    }
}
