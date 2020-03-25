package com.qdz.hop.mapper.sys.mapper;

import com.qdz.hop.po.sys.po.SysMenu;
import com.qdz.hop.po.sys.po.SysMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenuMapper {
    /**
     *
     * @mbg.generated 2020-03-13
     */
    long countByExample(SysMenuExample example);

    /**
     *
     * @mbg.generated 2020-03-13
     */
    int deleteByExample(SysMenuExample example);

    /**
     *
     * @mbg.generated 2020-03-13
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-03-13
     */
    int insert(SysMenu record);

    /**
     *
     * @mbg.generated 2020-03-13
     */
    int insertSelective(SysMenu record);

    /**
     *
     * @mbg.generated 2020-03-13
     */
    List<SysMenu> selectByExample(SysMenuExample example);

    /**
     *
     * @mbg.generated 2020-03-13
     */
    SysMenu selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-03-13
     */
    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    /**
     *
     * @mbg.generated 2020-03-13
     */
    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    /**
     *
     * @mbg.generated 2020-03-13
     */
    int updateByPrimaryKeySelective(SysMenu record);

    /**
     *
     * @mbg.generated 2020-03-13
     */
    int updateByPrimaryKey(SysMenu record);
}