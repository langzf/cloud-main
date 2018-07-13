package com.example.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @Author langzf
 * @Date 2018/7/13 15:05
 * className：
 * description：
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
