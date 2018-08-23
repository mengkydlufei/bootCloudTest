package com.bootcloud.controller;

import com.bootcloud.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 1 on 2018/8/23.
 */
@RestController
public class FeignController {
    @Autowired
    FeignService feignService;


    @RequestMapping("feiginOk")
    public String feiginOk(@RequestParam("name")String name){
        return feignService.feigin(name);
    }
}
