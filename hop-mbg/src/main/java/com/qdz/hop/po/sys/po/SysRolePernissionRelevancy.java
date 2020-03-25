package com.qdz.hop.po.sys.po;

import java.io.Serializable;

public class SysRolePernissionRelevancy implements Serializable {
    /**
     * id
     *
     * @mbg.generated 2020-03-07
     */
    private String id;

    /**
     * role_id
     *
     * @mbg.generated 2020-03-07
     */
    private String roleId;

    /**
     * permission_id
     *
     * @mbg.generated 2020-03-07
     */
    private String permissionId;

    /**
     * sys_role_pernission_relevancy
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
     * role_id
     * @return role_id role_id
     *
     * @mbg.generated 2020-03-07
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * role_id
     * @param roleId role_id
     *
     * @mbg.generated 2020-03-07
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * permission_id
     * @return permission_id permission_id
     *
     * @mbg.generated 2020-03-07
     */
    public String getPermissionId() {
        return permissionId;
    }

    /**
     * permission_id
     * @param permissionId permission_id
     *
     * @mbg.generated 2020-03-07
     */
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId == null ? null : permissionId.trim();
    }
}