package com.dsu2021.pj.domain.user.controller;

import com.dsu2021.pj.domain.user.dto.UserDto;
import com.dsu2021.pj.domain.user.service.SignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RequiredArgsConstructor
@RestController
public class SignUpController {

    private final SignUpService userService;

//    회원가입
    @PostMapping("/signUp")
    public ResponseEntity signUp(@RequestBody UserDto.SignUpReq signUpReq) {

        UserDto.SignUpRes signUp = userService.signUp(signUpReq);


        return null;
//        return new ResponseEntity<>(, HttpStatus.OK);
    }
}
