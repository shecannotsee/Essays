package com.shecannotsee.controller;

import com.shecannotsee.entity.SysUser;
import com.shecannotsee.service.SysUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@RequestMapping("/SYS_USER")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @ResponseBody
    @RequestMapping(value="/create",method = RequestMethod.POST)
    public int create(@RequestBody SysUser sysUser){
        return sysUserService.create(sysUser);
    }

    @ResponseBody
    @RequestMapping(value="/listById",method = RequestMethod.POST)
    public int listById(int id){
        return sysUserService.listById(id);
    }

    @ResponseBody
    @RequestMapping(value="/listAll",method = RequestMethod.POST)
    public List<SysUser> listAll(){
        return sysUserService.listAll();
    }


}
