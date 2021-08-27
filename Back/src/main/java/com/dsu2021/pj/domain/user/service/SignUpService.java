package com.dsu2021.pj.domain.user.service;

import com.dsu2021.pj.domain.user.dto.UserDto;
import com.dsu2021.pj.domain.user.entity.User;
import com.dsu2021.pj.domain.user.repository.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class SignUpService {

    @Autowired
    private UserMapper userMapper;

    //회원가입
    public UserDto.SignUpRes signUp(UserDto.SignUpReq signUpReq) {
        log.info("name : {}, email : {}, password = {}, birthday : {}, phone : {}", signUpReq.getName(), signUpReq.getEmail(), signUpReq.getPassword(), signUpReq.getBirthday(), signUpReq.getPhone());//입력값 로그로 확인

        //회원 전체의 email 조회
        List<UserDto.DuplexEmail> allUsersEmail = dupleEmail();

        //email에 대한 중복 값 확인 처리 필요
        for(UserDto.DuplexEmail duplexEmail : allUsersEmail){
            if (){

            }

        }

        //User entity에 바로 저장
        addUser(new User(null, signUpReq.getEmail(), signUpReq.getName(), signUpReq.getBirthday(), signUpReq.getPhone(), null, signUpReq.getPassword()));


        return null;
    }

    //입력값 저장
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    //전체 email만 조회
    public List<UserDto.DuplexEmail> dupleEmail(){
        return userMapper.dupleEmail();
    }

}
