package com.dsu2021.pj.domain.user.service;

import com.dsu2021.pj.domain.user.dto.UserDTO;
import com.dsu2021.pj.domain.user.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserDTO.UserIdRes user_save(UserDTO.UserSaveReq dto) {

        User user = null; //repository

        return UserDTO.UserIdRes.builder()
                .id(user.getId())
                .build();
    }
}
