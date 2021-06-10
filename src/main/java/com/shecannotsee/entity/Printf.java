package com.shecannotsee.entity;

import org.springframework.stereotype.Component;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Component//将ConfigurationProperties标记为spring组件
@ConfigurationProperties(prefix = "printf")
public class Printf {

    private String str;

    @Override
    public String toString() {
        return "Printf{" +
                "str='" + str + '\'' +
                '}';
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
