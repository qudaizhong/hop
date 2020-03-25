package com.qdz.hop.po.sys.po;

import java.io.Serializable;
import java.util.Date;

public class SysPermission implements Serializable {
    /**
     * id
     *
     * @mbg.generated 2020-03-07
     */
    private String id;

    /**
     * pid
     *
     * @mbg.generated 2020-03-07
     */
    private String pid;

    /**
     * 名称
     *
     * @mbg.generated 2020-03-07
     */
    private String name;

    /**
     * 值
     *
     * @mbg.generated 2020-03-07
     */
    private String value;

    /**
     * 图标
     *
     * @mbg.generated 2020-03-07
     */
    private String icon;

    /**
     * 权限类型0:目录 1:菜单 2:按钮
     *
     * @mbg.generated 2020-03-07
     */
    private Integer type;

    /**
     * 创建时间
     *
     * @mbg.generated 2020-03-07
     */
    private Date createTime;

    /**
     * 状态0:无效 1:有效
     *
     * @mbg.generated 2020-03-07
     */
    private Integer status;

    /**
     * 修改时间
     *
     * @mbg.generated 2020-03-07
     */
    private Date updateTime;

    /**
     * 资源路径
     *
     * @mbg.generated 2020-03-07
     */
    private String uri;

    /**
     * sys_permission
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
     * pid
     * @return pid pid
     *
     * @mbg.generated 2020-03-07
     */
    public String getPid() {
        return pid;
    }

    /**
     * pid
     * @param pid pid
     *
     * @mbg.generated 2020-03-07
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * 名称
     * @return name 名称
     *
     * @mbg.generated 2020-03-07
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     * @param name 名称
     *
     * @mbg.generated 2020-03-07
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 值
     * @return value 值
     *
     * @mbg.generated 2020-03-07
     */
    public String getValue() {
        return value;
    }

    /**
     * 值
     * @param value 值
     *
     * @mbg.generated 2020-03-07
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * 图标
     * @return icon 图标
     *
     * @mbg.generated 2020-03-07
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 图标
     * @param icon 图标
     *
     * @mbg.generated 2020-03-07
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 权限类型0:目录 1:菜单 2:按钮
     * @return type 权限类型0:目录 1:菜单 2:按钮
     *
     * @mbg.generated 2020-03-07
     */
    public Integer getType() {
        return type;
    }

    /**
     * 权限类型0:目录 1:菜单 2:按钮
     * @param type 权限类型0:目录 1:菜单 2:按钮
     *
     * @mbg.generated 2020-03-07
     */
    public void setType(Integer type) {
        this.type = type;
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
     * 资源路径
     * @return uri 资源路径
     *
     * @mbg.generated 2020-03-07
     */
    public String getUri() {
        return uri;
    }

    /**
     * 资源路径
     * @param uri 资源路径
     *
     * @mbg.generated 2020-03-07
     */
    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }
}