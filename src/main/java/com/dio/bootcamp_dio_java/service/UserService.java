package com.dio.bootcamp_dio_java.service;

import com.dio.bootcamp_dio_java.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
