package com.shecannotsee.entity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="SYS_USER")
public class SysUser {

    /*** 主键 */
    @Column(name = "ID")
    private int id;
    /*** 用户的账号，账号密码同字段，用来登录 */
    @Column(name = "ACCOUNT")
    private String account;
    /*** 账户创建时间 */
    @Column(name = "CREATE_TIME")
    private String createTime;
    /*** 最后修改时间 */
    @Column(name = "UPDATE_TIME")
    private String updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
