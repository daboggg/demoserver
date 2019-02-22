package ru.zinin.demoserver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping(path = "/test")
    @ResponseBody
    public String start() {
        return "HELLO";
    }
}
