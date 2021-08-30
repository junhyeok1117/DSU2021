package com.dsu2021.pj.domain.user.repository;

import com.dsu2021.pj.domain.user.dto.UserDto;
import com.dsu2021.pj.domain.user.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    void 일반_로그인() {

        UserDto.SignInReq req = new UserDto.SignInReq("pjunh1117@gmail.com", "123");

        User user = userMapper.signIn(req);

        assertThat(user.getEmail()).isEqualTo("pjunh1117@gmail.com");
        assertThat(user.getPassword()).isEqualTo("123");
    }
}