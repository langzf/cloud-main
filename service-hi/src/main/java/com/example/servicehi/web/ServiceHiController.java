package com.example.servicehi.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author langzf
 * @Date 2018/7/12 17:50
 * className：
 * description：
 */
@RestController
public class ServiceHiController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name){
        return "hi " + name + ", I am from prot " + port;
    }

}
