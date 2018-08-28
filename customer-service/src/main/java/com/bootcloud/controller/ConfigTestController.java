package com.bootcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 1 on 2018/8/28.
 */
@RefreshScope
@RestController
public class ConfigTestController {
    @Value("${msg}")
    private String msg;

    @RequestMapping("configtest")
    public String msgConfig(){
        return this.msg;
    }
}
