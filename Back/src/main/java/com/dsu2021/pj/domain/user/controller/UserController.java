package com.dsu2021.pj.domain.user.controller;

import com.dsu2021.pj.domain.user.dto.UserDto;
import com.dsu2021.pj.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@CrossOrigin("*")
@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    //로그인
    @PostMapping("/signIn")
    public ResponseEntity<UserDto.UserCheckEmail> signIn(HttpSession session, @RequestBody UserDto.SignInReq signInReq) {

        UserDto.UserCheckEmail userCheckEmail = userService.checkUser(signInReq);

        session.setAttribute("email", userCheckEmail.getEmail());//email 값을 세션에 저장

        return new ResponseEntity<>(userCheckEmail, HttpStatus.OK);
    }


    //회원가입
    @PostMapping("/signUp")
    public ResponseEntity signUp(@RequestBody UserDto.SignUpReq signUpReq) {

        userService.signUp(signUpReq);

        return new ResponseEntity<>(HttpStatus.OK);
    }


    //로그아웃
    @GetMapping("/signOut")
    public ResponseEntity signOut(HttpSession session){

        session.invalidate();
        return new ResponseEntity(HttpStatus.OK);

    }



}
