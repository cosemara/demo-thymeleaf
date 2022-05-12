package com.example.thymeleaf.sample.common.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/hp/common")
@RestController
@RequiredArgsConstructor // Constructor based Injection 사용으로 변경
public class CommonController {

    @GetMapping("/index")
    public String index() throws Exception {
        return "index";
    }
}
