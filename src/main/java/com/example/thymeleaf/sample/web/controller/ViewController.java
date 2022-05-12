package com.example.thymeleaf.sample.web.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping("/hp")
@RequiredArgsConstructor
@Controller
public class ViewController {

    @GetMapping("")
    public String main(Model model){
        log.debug("sample-list");

        return "homepage/sample-list";
    }
}
