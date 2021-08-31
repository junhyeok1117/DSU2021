package com.dsu2021.pj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Dsu2021Application {

    public static void main(String[] args) {
        SpringApplication.run(Dsu2021Application.class, args);
    }

}
