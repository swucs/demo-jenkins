package com.example.demojenkins;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    @Transactional
    void createUser(UserDto userDto);

    List<UserDto> getAllUsers();
}
