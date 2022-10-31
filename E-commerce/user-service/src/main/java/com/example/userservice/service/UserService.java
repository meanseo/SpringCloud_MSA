package com.example.userservice.service;

import com.example.userservice.dto.UserDto;
import com.example.userservice.jpa.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId); //가져온 데이터를 가공할 경우 UserDto
    Iterable<UserEntity> getUserrByAll(); //그대로 반환할 경우 Iterable<UserEntity>
}
