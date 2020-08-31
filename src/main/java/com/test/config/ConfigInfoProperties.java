package com.test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class ConfigInfoProperties {

    @Value("${test.profile}")
    private String config;

    public String getConfig() {
        return config;
    }
}