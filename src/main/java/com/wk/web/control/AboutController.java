package com.wk.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/about")
public class AboutController {

    @GetMapping("/company")
    public String company() {
        return "About/company";
    }

    @GetMapping("/jobs")
    public String jobs() {
        return "About/jobs";
    }
}
