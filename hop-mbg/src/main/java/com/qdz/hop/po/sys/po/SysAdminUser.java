package com.qdz.hop.po.sys.po;

import java.io.Serializable;
import java.util.Date;

public class SysAdminUser implements Serializable {
    /**
     * id
     *
     * @mbg.generated 2020-03-07
     */
    private String id;

    /**
     * 用户名
     *
     * @mbg.generated 2020-03-07
     */
    private String username;

    /**
     * 密码
     *
     * @mbg.generated 2020-03-07
     */
    private String password;

    /**
     * 头像
     *
     * @mbg.generated 2020-03-07
     */
    private String icon;

    /**
     * 邮箱
     *
     * @mbg.generated 2020-03-07
     */
    private String email;

    /**
     * 昵称
     *
     * @mbg.generated 2020-03-07
     */
    private String nickName;

    /**
     * 创建时间
     *
     * @mbg.generated 2020-03-07
     */
    private Date createTime;

    /**
     * 修改时间
     *
     * @mbg.generated 2020-03-07
     */
    private Date updateTime;

    /**
     * 最后登录时间
     *
     * @mbg.generated 2020-03-07
     */
    private Date lastLoginTime;

    /**
     * 最后登录IP
     *
     * @mbg.generated 2020-03-07
     */
    private String lastLoginIp;

    /**
     * 状态0:无效 1:有效
     *
     * @mbg.generated 2020-03-07
     */
    private Integer status;

    /**
     * sys_admin_user
     *
     * @mbg.generated 2020-03-07
     */
    private static final long serialVersionUID = 1L;

    /**
     * id
     * @return id id
     *
     * @mbg.generated 2020-03-07
     */
    public String getId() {
        return id;
    }

    /**
     * id
     * @param id id
     *
     * @mbg.generated 2020-03-07
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 用户名
     * @return username 用户名
     *
     * @mbg.generated 2020-03-07
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户名
     * @param username 用户名
     *
     * @mbg.generated 2020-03-07
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 密码
     * @return password 密码
     *
     * @mbg.generated 2020-03-07
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     *
     * @mbg.generated 2020-03-07
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 头像
     * @return icon 头像
     *
     * @mbg.generated 2020-03-07
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 头像
     * @param icon 头像
     *
     * @mbg.generated 2020-03-07
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 邮箱
     * @return email 邮箱
     *
     * @mbg.generated 2020-03-07
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     * @param email 邮箱
     *
     * @mbg.generated 2020-03-07
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 昵称
     * @return nick_name 昵称
     *
     * @mbg.generated 2020-03-07
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 昵称
     * @param nickName 昵称
     *
     * @mbg.generated 2020-03-07
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     *
     * @mbg.generated 2020-03-07
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     *
     * @mbg.generated 2020-03-07
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * @return update_time 修改时间
     *
     * @mbg.generated 2020-03-07
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
     *
     * @mbg.generated 2020-03-07
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 最后登录时间
     * @return last_login_time 最后登录时间
     *
     * @mbg.generated 2020-03-07
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 最后登录时间
     * @param lastLoginTime 最后登录时间
     *
     * @mbg.generated 2020-03-07
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 最后登录IP
     * @return last_login_ip 最后登录IP
     *
     * @mbg.generated 2020-03-07
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * 最后登录IP
     * @param lastLoginIp 最后登录IP
     *
     * @mbg.generated 2020-03-07
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    /**
     * 状态0:无效 1:有效
     * @return status 状态0:无效 1:有效
     *
     * @mbg.generated 2020-03-07
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态0:无效 1:有效
     * @param status 状态0:无效 1:有效
     *
     * @mbg.generated 2020-03-07
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}