package com.shecannotsee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @SpringBootApplication标注主程序启动，说明是一个springboot应用
 */
@SpringBootApplication
@MapperScan("com.shecannotsee.mapper")
public class EssaysApplication
{
    public static void main(String[] args){
        //Spring应用启动
        SpringApplication.run(EssaysApplication.class,args);
    }
}
