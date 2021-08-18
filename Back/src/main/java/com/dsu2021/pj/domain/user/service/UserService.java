package com.dsu2021.pj.domain.user.service;

import com.dsu2021.pj.domain.user.dto.UserDto;
import com.dsu2021.pj.domain.user.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserDto.UserIdRes user_save(UserDto.UserSaveReq dto) {

        User user = null; //repository

        return UserDto.UserIdRes.builder()
                .id(user.getEmail())
                .build();
    }
}
