package com.qdz.hop.mapper.sys.mapper;

import com.qdz.hop.po.sys.po.SysRoleMenuRelevancy;
import com.qdz.hop.po.sys.po.SysRoleMenuRelevancyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMenuRelevancyMapper {
    /**
     *
     * @mbg.generated 2020-03-13
     */
    long countByExample(SysRoleMenuRelevancyExample example);

    /**
     *
     * @mbg.generated 2020-03-13
     */
    int deleteByExample(SysRoleMenuRelevancyExample example);

    /**
     *
     * @mbg.generated 2020-03-13
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-03-13
     */
    int insert(SysRoleMenuRelevancy record);

    /**
     *
     * @mbg.generated 2020-03-13
     */
    int insertSelective(SysRoleMenuRelevancy record);

    /**
     *
     * @mbg.generated 2020-03-13
     */
    List<SysRoleMenuRelevancy> selectByExample(SysRoleMenuRelevancyExample example);

    /**
     *
     * @mbg.generated 2020-03-13
     */
    SysRoleMenuRelevancy selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-03-13
     */
    int updateByExampleSelective(@Param("record") SysRoleMenuRelevancy record, @Param("example") SysRoleMenuRelevancyExample example);

    /**
     *
     * @mbg.generated 2020-03-13
     */
    int updateByExample(@Param("record") SysRoleMenuRelevancy record, @Param("example") SysRoleMenuRelevancyExample example);

    /**
     *
     * @mbg.generated 2020-03-13
     */
    int updateByPrimaryKeySelective(SysRoleMenuRelevancy record);

    /**
     *
     * @mbg.generated 2020-03-13
     */
    int updateByPrimaryKey(SysRoleMenuRelevancy record);
}