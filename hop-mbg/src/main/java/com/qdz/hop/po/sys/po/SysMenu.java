package com.qdz.hop.po.sys.po;

import java.io.Serializable;
import java.util.Date;

public class SysMenu implements Serializable {
    /**
     * id
     *
     * @mbg.generated 2020-03-13
     */
    private String id;

    /**
     * pid
     *
     * @mbg.generated 2020-03-13
     */
    private String pid;

    /**
     * 名称
     *
     * @mbg.generated 2020-03-13
     */
    private String title;

    /**
     * code
     *
     * @mbg.generated 2020-03-13
     */
    private String code;

    /**
     * 层级
     *
     * @mbg.generated 2020-03-13
     */
    private Integer level;

    /**
     * 排序
     *
     * @mbg.generated 2020-03-13
     */
    private Integer sort;

    /**
     * 图标
     *
     * @mbg.generated 2020-03-13
     */
    private String icon;

    /**
     * 是否隐藏
     *
     * @mbg.generated 2020-03-13
     */
    private String isHidden;

    /**
     * 创建时间
     *
     * @mbg.generated 2020-03-13
     */
    private Date createTime;

    /**
     * 状态 0:无效 1:有效 2:删除
     *
     * @mbg.generated 2020-03-13
     */
    private Integer status;

    /**
     * sys_menu
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
     * pid
     * @return pid pid
     *
     * @mbg.generated 2020-03-13
     */
    public String getPid() {
        return pid;
    }

    /**
     * pid
     * @param pid pid
     *
     * @mbg.generated 2020-03-13
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * 名称
     * @return title 名称
     *
     * @mbg.generated 2020-03-13
     */
    public String getTitle() {
        return title;
    }

    /**
     * 名称
     * @param title 名称
     *
     * @mbg.generated 2020-03-13
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * code
     * @return code code
     *
     * @mbg.generated 2020-03-13
     */
    public String getCode() {
        return code;
    }

    /**
     * code
     * @param code code
     *
     * @mbg.generated 2020-03-13
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 层级
     * @return level 层级
     *
     * @mbg.generated 2020-03-13
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 层级
     * @param level 层级
     *
     * @mbg.generated 2020-03-13
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 排序
     * @return sort 排序
     *
     * @mbg.generated 2020-03-13
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序
     * @param sort 排序
     *
     * @mbg.generated 2020-03-13
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 图标
     * @return icon 图标
     *
     * @mbg.generated 2020-03-13
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 图标
     * @param icon 图标
     *
     * @mbg.generated 2020-03-13
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 是否隐藏
     * @return is_hidden 是否隐藏
     *
     * @mbg.generated 2020-03-13
     */
    public String getIsHidden() {
        return isHidden;
    }

    /**
     * 是否隐藏
     * @param isHidden 是否隐藏
     *
     * @mbg.generated 2020-03-13
     */
    public void setIsHidden(String isHidden) {
        this.isHidden = isHidden == null ? null : isHidden.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     *
     * @mbg.generated 2020-03-13
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     *
     * @mbg.generated 2020-03-13
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 状态 0:无效 1:有效 2:删除
     * @return status 状态 0:无效 1:有效 2:删除
     *
     * @mbg.generated 2020-03-13
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态 0:无效 1:有效 2:删除
     * @param status 状态 0:无效 1:有效 2:删除
     *
     * @mbg.generated 2020-03-13
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}