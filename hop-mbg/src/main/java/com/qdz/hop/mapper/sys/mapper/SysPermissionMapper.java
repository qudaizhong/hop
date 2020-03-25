package com.qdz.hop.mapper.sys.mapper;

import com.qdz.hop.po.sys.po.SysPermission;
import com.qdz.hop.po.sys.po.SysPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPermissionMapper {
    /**
     *
     * @mbg.generated 2020-03-07
     */
    long countByExample(SysPermissionExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int deleteByExample(SysPermissionExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int insert(SysPermission record);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int insertSelective(SysPermission record);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    List<SysPermission> selectByExample(SysPermissionExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    SysPermission selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int updateByExampleSelective(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int updateByExample(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int updateByPrimaryKeySelective(SysPermission record);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int updateByPrimaryKey(SysPermission record);
}