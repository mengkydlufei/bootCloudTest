package com.bootcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 1 on 2018/8/23.
 */

@FeignClient(value = "customer-service",fallback = FeiginFallback.class)
public interface FeignService {
    @RequestMapping("ok")
    public String feigin(@RequestParam("name")String name);

}
