package com.qdz.hop.po.sys.po;

import java.io.Serializable;

public class SysAdminRoleRelevancy implements Serializable {
    /**
     * id
     *
     * @mbg.generated 2020-03-07
     */
    private String id;

    /**
     * 用户id
     *
     * @mbg.generated 2020-03-07
     */
    private String adminUserId;

    /**
     * 角色id
     *
     * @mbg.generated 2020-03-07
     */
    private String roleId;

    /**
     * sys_admin_role_relevancy
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
     * 用户id
     * @return admin_user_id 用户id
     *
     * @mbg.generated 2020-03-07
     */
    public String getAdminUserId() {
        return adminUserId;
    }

    /**
     * 用户id
     * @param adminUserId 用户id
     *
     * @mbg.generated 2020-03-07
     */
    public void setAdminUserId(String adminUserId) {
        this.adminUserId = adminUserId == null ? null : adminUserId.trim();
    }

    /**
     * 角色id
     * @return role_id 角色id
     *
     * @mbg.generated 2020-03-07
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 角色id
     * @param roleId 角色id
     *
     * @mbg.generated 2020-03-07
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }
}