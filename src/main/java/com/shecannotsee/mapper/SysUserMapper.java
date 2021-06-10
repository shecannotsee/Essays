package com.shecannotsee.mapper;

import com.shecannotsee.entity.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserMapper {

    /**
     * 新增
     * @param sysUser
     * @return
     */
    int create(SysUser sysUser);

    /**
     * 根据id查找
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
