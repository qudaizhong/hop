package com.qdz.hop.po.sys.po;

import java.io.Serializable;
import java.util.Date;

public class SysAdminRole implements Serializable {
    /**
     * id
     *
     * @mbg.generated 2020-03-07
     */
    private String id;

    /**
     * 角色名称
     *
     * @mbg.generated 2020-03-07
     */
    private String roleName;

    /**
     * 说明
     *
     * @mbg.generated 2020-03-07
     */
    private String description;

    /**
     * 排序号
     *
     * @mbg.generated 2020-03-07
     */
    private Integer sortNumber;

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
     * 状态0:无效 1:有效
     *
     * @mbg.generated 2020-03-07
     */
    private Integer status;

    /**
     * sys_admin_role
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
     * 角色名称
     * @return role_name 角色名称
     *
     * @mbg.generated 2020-03-07
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 角色名称
     * @param roleName 角色名称
     *
     * @mbg.generated 2020-03-07
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * 说明
     * @return description 说明
     *
     * @mbg.generated 2020-03-07
     */
    public String getDescription() {
        return description;
    }

    /**
     * 说明
     * @param description 说明
     *
     * @mbg.generated 2020-03-07
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 排序号
     * @return sort_number 排序号
     *
     * @mbg.generated 2020-03-07
     */
    public Integer getSortNumber() {
        return sortNumber;
    }

    /**
     * 排序号
     * @param sortNumber 排序号
     *
     * @mbg.generated 2020-03-07
     */
    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
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