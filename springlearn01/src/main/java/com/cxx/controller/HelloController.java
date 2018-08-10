package com.cxx.controller;/**
 * @Description: //TODO
 * @Author: cxx
 * @Date: Created in 2018/8/1018:39
 * @Modfied By:
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author xujiaxi
 * @Date 2018/8/10 18:39
 * @Version 1.0
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @ResponseBody
    @RequestMapping("world")
    public String helloWorld() {
        return "Hello World";
    }

}
