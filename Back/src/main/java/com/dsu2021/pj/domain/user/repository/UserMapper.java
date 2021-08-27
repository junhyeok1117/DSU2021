package com.dsu2021.pj.domain.user.repository;

import com.dsu2021.pj.domain.user.dto.UserDto;
import com.dsu2021.pj.domain.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    //	User 전체 조회
    List<User> getAllUsers();

    //	User 로그인 시 email과 password 조회
    List<User> getUsers();

    //  회원가입 시 중복을 확인하기 위한 email 조회
    List<UserDto.DuplexEmail> dupleEmail();

    //	User 추가
    void addUser(User user);

}
