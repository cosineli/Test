package com.cos.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : cosine
 * @Description :
 * @Date : Created in 16:13 2017/12/11
 */
@RestController
public class TestController {

    @RequestMapping(value = "/test")
    public String getTest(){
        return "This is Test !";
    }

}
