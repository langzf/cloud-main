package com.example.servicefeign.web;

import com.example.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author langzf
 * @Date 2018/7/13 14:31
 * className：
 * description：
 */
@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return  schedualServiceHi.sayHiFromClientOne(name);
    }

}
