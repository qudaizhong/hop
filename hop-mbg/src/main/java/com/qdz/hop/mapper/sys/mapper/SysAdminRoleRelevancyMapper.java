package com.qdz.hop.mapper.sys.mapper;

import com.qdz.hop.po.sys.po.SysAdminRoleRelevancy;
import com.qdz.hop.po.sys.po.SysAdminRoleRelevancyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAdminRoleRelevancyMapper {
    /**
     *
     * @mbg.generated 2020-03-07
     */
    long countByExample(SysAdminRoleRelevancyExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int deleteByExample(SysAdminRoleRelevancyExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int insert(SysAdminRoleRelevancy record);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int insertSelective(SysAdminRoleRelevancy record);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    List<SysAdminRoleRelevancy> selectByExample(SysAdminRoleRelevancyExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    SysAdminRoleRelevancy selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int updateByExampleSelective(@Param("record") SysAdminRoleRelevancy record, @Param("example") SysAdminRoleRelevancyExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int updateByExample(@Param("record") SysAdminRoleRelevancy record, @Param("example") SysAdminRoleRelevancyExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int updateByPrimaryKeySelective(SysAdminRoleRelevancy record);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int updateByPrimaryKey(SysAdminRoleRelevancy record);
}