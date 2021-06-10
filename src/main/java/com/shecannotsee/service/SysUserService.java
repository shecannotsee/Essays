package com.shecannotsee.service;

import com.shecannotsee.entity.SysUser;

import java.util.List;

public interface SysUserService {

    /**
     * 新增
     * @param sysUser
     * @return
     */
    int create(SysUser sysUser);

    /**
     * 根据id查
     * @param id
     * @return
     */
    int listById(int id);

    /**
     * 列举全部
     * @return
     */
    List<SysUser> listAll();

}
