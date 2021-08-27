package com.dsu2021.pj.domain.user.controller;

import com.dsu2021.pj.domain.user.dto.UserDto;
import com.dsu2021.pj.domain.user.service.SignInService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@CrossOrigin(origins="*")
@RequiredArgsConstructor
@RestController
public class SignInController {

    private final SignInService userService;

    //로그인
    @PostMapping ("/signIn")
    public ResponseEntity<UserDto.UserCheckEmail> signIn(HttpSession session, @RequestBody UserDto.SignInReq signInReq) {

        UserDto.UserCheckEmail userCheckEmail = userService.checkUser(signInReq);

        session.setAttribute("email", userCheckEmail.getEmail());//email 값을 세션에 저장

        return new ResponseEntity<>(userCheckEmail, HttpStatus.OK);

    }



//    @PostMapping
//    ResponseEntity<UserDto> join(@RequestBody UserDto.UserSaveReq dto) {
//
//        return new ResponseEntity<UserDto>(userService.signUp(dto), HttpStatus.OK);
//    }

//    @GetMapping
//    ResponseEntity<User> getUserInfo(@RequestBody User user) {
//
//        //UserForm -> 사용자에게 입력받은 데이터 dto
//        //User -> DB의 엔티티
//        //UserDto -> 클라이언트에 전달해주는 dto
//
//
//
//        return new ResponseEntity("", HttpStatus.OK);
//    }
//
//    @PostMapping
//    ResponseEntity<?> join(@RequestBody UserDto.UserSaveReq dto) {
//
//
//        return new ResponseEntity<>(userService.user_save(dto), HttpStatus.OK);
//    }
}
