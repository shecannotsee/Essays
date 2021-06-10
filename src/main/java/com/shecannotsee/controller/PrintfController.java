package com.shecannotsee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shecannotsee.service.PrintfService;

@RestController
public class PrintfController
{
    private PrintfService printfService;

    @RequestMapping("/hello")//接受浏览器发送过来的指令
    public String Printf(){
        String temp="hello world";
        return temp;
    }

}
