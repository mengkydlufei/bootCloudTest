package com.bootcloud.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 1 on 2018/8/23.
 */
@Component
public class FeiginFallback implements  FeignService{
    @Override
    public String feigin(@RequestParam("name") String name) {
        return "-------------feiginfallback----------------"+name;
    }
}
