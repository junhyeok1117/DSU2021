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
public class SignInService {

    @Autowired
    private UserMapper userMapper;


    //로그인
    public UserDto.UserCheckEmail checkUser(UserDto.SignInReq signInReq) {
        log.info("email : {}, password = {}", signInReq.getEmail(), signInReq.getPassword());//입력값 로그로 확인

        List<User> AllUsers = getUser();

        UserDto.UserCheckEmail checkEmail = new UserDto.UserCheckEmail();

        for (User user : AllUsers) {
            if (!user.getEmail().equals(signInReq.getEmail())) {

            } else if (!user.getPassword().equals(signInReq.getPassword())) {
                log.info("password error");
//               controllerAdvice로 전달 , exception 발생시켜야함
            } else {
                checkEmail.setEmail(signInReq.getEmail());

                return checkEmail;
            }
        }
        log.info("email error");
//      controllerAdvice로 전달 , null 대신 exception 발생시켜야함
        return null;
    }


//    전체 user 조회
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }


//    로그인 시 필요한 정보 조회
    public List<User> getUser() {
        return userMapper.getUsers();
    }





//    public ResponseEntity<?> changeDto(@RequestBody User user) {
//        ModelMapper mapper = new ModelMapper();
//        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT); /* 강력하게 */
//
//        UserDto userDto = mapper.map(userEntity, UserDto.class);
//    }

//    public UserDto.UserIdRes signUp (UserDto.UserSaveReq dto) {
//
//        User user = null; //repository
//
//        return UserDto.UserIdRes.builder()
//                .id(user.getEmail())
//                .build();
//    }

}
