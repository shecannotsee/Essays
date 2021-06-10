package com.shecannotsee.service.impl;

import com.shecannotsee.entity.SysUser;
import com.shecannotsee.mapper.SysUserMapper;
import com.shecannotsee.service.SysUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public int create(SysUser sysUser){
        sysUserMapper.create(sysUser);
        return 1;
    }

    @Override
    public int listById(int id){
        sysUserMapper.listById(id);
        return 1;
    }

    @Override
    public List<SysUser> listAll(){
        return sysUserMapper.listAll();
    }

}
