package com.bootcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by 1 on 2018/8/23.
 */
@RestController
public class CustomerController {
    @RequestMapping("ok")
    public String cusOk(@RequestParam("name")String name)throws Exception{

        int sleepTime = new Random().nextInt(3000);
        Thread.sleep(sleepTime);
        return "-----------customer-----------"+sleepTime+"---------"+name;
    }
}
