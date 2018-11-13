package com.wk.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "Home/index";
    }

    /**用户注册**/
    @GetMapping("/register")
    public String register() {
        return "Home/register";
    }
}
