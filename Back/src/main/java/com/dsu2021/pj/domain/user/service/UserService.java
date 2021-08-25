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
    public UserDto.UserCheckEmail checkUser(UserDto.SignInReq signInReq) {//1. 클라이언트의 입력값 호출
        log.info("email : {}, password = {}", signInReq.getEmail(), signInReq.getPassword());//입력값 로그로 확인


//      2. 로그인에 필요한 정보 조회
        List<User> AllUsers = getUser();
        log.info("check");

//      3. 입력 값과 비교
        for (User user : AllUsers) {
            if (!user.getEmail().equals(signInReq.getEmail())) {
                log.info("email error");
//               controllerAdvice로 전달 , exception 발생시켜야함
            } else if (!user.getPassword().equals(signInReq.getPassword())) {
                log.info("password error");
//               controllerAdvice로 전달 , exception 발생시켜야함
            } else {
//              4. 일치 시 id값만 프런트에 전달(확인용)
                UserDto.UserCheckEmail checkEmail = new UserDto.UserCheckEmail();
                checkEmail.setEmail(signInReq.getEmail());

                return checkEmail;
            }
        }
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


    //    로그인 성공 시 확인용 email 값 전송
    public UserDto.UserCheckEmail userCheckEmail() {
        UserDto.UserCheckEmail checkEmail = new UserDto.UserCheckEmail();

        return checkEmail;
    }


//    public UserDto.UserIdRes userSignIn(UserDto.UserSignIn dto) {
//
//        try {
//            // 유저 이메일, 비밀번호 -> 조회하는 로직
//            //        userMapper
//
//        } catch (Exception e) {
//            return
//        }
//
//        return
//    }


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

//    public UserDto.SignIn signIn(UserDto.SignIn dto) {
//        return UserDto.SignIn;
//    }
}
