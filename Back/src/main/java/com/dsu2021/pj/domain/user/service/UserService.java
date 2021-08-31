package com.dsu2021.pj.domain.user.service;

import com.dsu2021.pj.domain.user.dto.UserDto;
import com.dsu2021.pj.domain.user.entity.User;
import com.dsu2021.pj.domain.user.repository.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.List;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    //로그인
    public UserDto.UserCheckEmail checkUser(UserDto.SignInReq signInReq) {
        log.info("email : {}, password = {}", signInReq.getEmail(), signInReq.getPassword());//입력값 로그로 확인


        User user = userMapper.signIn(signInReq);

        UserDto.UserCheckEmail checkEmail = new UserDto.UserCheckEmail();

//      일치하는 값이 없는 경우에 예외처리 필요
        try {
            checkEmail.setEmail(user.getEmail());
        }catch (Exception e){
            log.info("error 발생");
        }

//      controllerAdvice로 전달하여 exception 발생
        return checkEmail;
    }


    //회원가입
    public void signUp(UserDto.SignUpReq signUpReq) {
        log.info("name : {}, email : {}, password = {}, birthday : {}, phone : {}", signUpReq.getName(), signUpReq.getEmail(), signUpReq.getPassword(), signUpReq.getBirthday(), signUpReq.getPhone());//입력값 로그로 확인

        //회원 email 조회
//        User user = userMapper.dupleEmail(signUpReq);

        userMapper.addUser(
                new User(null, signUpReq.getName(), signUpReq.getEmail(), signUpReq.getBirthday(), signUpReq.getPhone(), null, signUpReq.getPassword()));


        //email에 대한 중복 값 확인 처리 필요
//        if (user.getEmail().equals(signUpReq.getEmail())){//중복이라면 예외처리
//            //controllerAdvice로 전달하여 exception 발생
//        } else {
//            //중복 email이 없다면 User entity에 바로 저장
//            userMapper.addUser(new User(null, signUpReq.getEmail(), signUpReq.getName(), signUpReq.getBirthday(), signUpReq.getPhone(), null, signUpReq.getPassword()));
//
//        }
    }


}
