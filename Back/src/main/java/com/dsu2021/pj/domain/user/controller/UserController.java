package com.dsu2021.pj.domain.user.controller;
import com.dsu2021.pj.domain.user.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping
    ResponseEntity<User> getUserInfo(@RequestBody User user) {

        //UserForm -> 사용자에게 입력받은 데이터 dto
        //User -> DB의 엔티티
        //UserDto -> 클라이언트에 전달해주는 dto



        return new ResponseEntity(, HttpStatus.OK);
    }
}
