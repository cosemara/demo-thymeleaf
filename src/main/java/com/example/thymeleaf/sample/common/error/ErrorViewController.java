package com.example.thymeleaf.sample.common.error;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@RequestMapping(value = "/error")
@Log4j2
@Controller
public class ErrorViewController implements ErrorController {

    // 에러 페이지 정의
    private static final String ERROR_404_PAGE_PATH = "error/notFound";
    private static final String ERROR_ETC_PAGE_PATH = "error/serverError";

    @GetMapping(value = "")
    public String error(HttpServletRequest request, Model model) {
        // 에러 코드를 획득한다.
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        // 에러 코드에 대한 상태 정보
        HttpStatus httpStatus = HttpStatus.valueOf(Integer.valueOf(status.toString()));

        if (status != null) {
            // HttpStatus와 비교해 페이지 분기를 나누기 위한 변수
            int statusCode = Integer.valueOf(status.toString());
            // 로그로 상태값을 기록 및 출력
            log.debug("httpStatus : " + statusCode);
            log.debug("code : " + status.toString());
            log.debug("msg : " + httpStatus.getReasonPhrase());
            // 404 error
            if (statusCode == HttpStatus.NOT_FOUND.value()) {
                return ERROR_404_PAGE_PATH;
            }
        }

        // 정의한 에러 외 모든 에러는 error/error 페이지로 보낸다.
        return ERROR_ETC_PAGE_PATH;
    }

    public String getErrorPath() {
        return "/error";
    }
}