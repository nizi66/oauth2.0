package com.test.controller;

import com.test.config.ConfigInfoProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RefreshScope
public class TestController {

    @Autowired
    private ConfigInfoProperties configInfoProperties;

    @GetMapping("/test")
    public void test(){
       log.info("test=========="+configInfoProperties.getConfig());
    }



}
