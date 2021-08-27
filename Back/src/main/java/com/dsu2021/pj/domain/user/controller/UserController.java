package com.dsu2021.pj.domain.user.controller;

import com.dsu2021.pj.domain.user.dto.UserDto;
import com.dsu2021.pj.domain.user.entity.User;
import com.dsu2021.pj.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@CrossOrigin(origins="*")
@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

//    회원가입
//    @PostMapping("/signUp")
//    public ResponseEntity signUp(@ModelAttribute UserDto.SignUpReq signUpReq) {
//
//
//
//
//        return new ResponseEntity<>(, HttpStatus.OK);
//    }


    //로그인 요청
    @PostMapping ("/signIn")
    public ResponseEntity<UserDto.UserCheckEmail> signIn(HttpSession session, @RequestBody UserDto.SignInReq signInReq) {

        UserDto.UserCheckEmail userCheckEmail = userService.checkUser(signInReq);

        session.setAttribute("email", userCheckEmail.getEmail());

        return new ResponseEntity<>(userCheckEmail, HttpStatus.OK);

    }

    // 로그인 요청
//    @PostMapping("/signIn")
//    public ResponseEntity<UserDto.UserIdRes> signIn(HttpSession session, @ModelAttribute UserDto.UserSignIn dto) {
//
//        UserDto.UserSignRes userRes = userService.userSignIn(dto);
//
//        session.setAttribute(userRes.getEmail(), "email");
//
//        return new ResponseEntity<UserDto.UserIdRes>(userRes, HttpStatus.OK);
//    }


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
