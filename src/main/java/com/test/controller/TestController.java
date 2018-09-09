package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "{\"userid\":\"test\", \"password\":\"123456\"}";
    }

    @RequestMapping("success")
    public String hello(ModelMap modelMap){
        modelMap.addAttribute("success", "yes");
        return "hello";
    }
}
