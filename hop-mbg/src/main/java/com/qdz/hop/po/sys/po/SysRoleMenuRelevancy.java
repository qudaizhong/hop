package com.qdz.hop.po.sys.po;

import java.io.Serializable;

public class SysRoleMenuRelevancy implements Serializable {
    /**
     * id
     *
     * @mbg.generated 2020-03-13
     */
    private String id;

    /**
     * 角色id
     *
     * @mbg.generated 2020-03-13
     */
    private String roleId;

    /**
     * 菜单id
     *
     * @mbg.generated 2020-03-13
     */
    private String menuId;

    /**
     * sys_role_menu_relevancy
     *
     * @mbg.generated 2020-03-13
     */
    private static final long serialVersionUID = 1L;

    /**
     * id
     * @return id id
     *
     * @mbg.generated 2020-03-13
     */
    public String getId() {
        return id;
    }

    /**
     * id
     * @param id id
     *
     * @mbg.generated 2020-03-13
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 角色id
     * @return role_id 角色id
     *
     * @mbg.generated 2020-03-13
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 角色id
     * @param roleId 角色id
     *
     * @mbg.generated 2020-03-13
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * 菜单id
     * @return menu_id 菜单id
     *
     * @mbg.generated 2020-03-13
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * 菜单id
     * @param menuId 菜单id
     *
     * @mbg.generated 2020-03-13
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }
}