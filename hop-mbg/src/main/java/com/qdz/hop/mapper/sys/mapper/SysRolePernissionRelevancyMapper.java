package com.qdz.hop.mapper.sys.mapper;

import com.qdz.hop.po.sys.po.SysRolePernissionRelevancy;
import com.qdz.hop.po.sys.po.SysRolePernissionRelevancyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolePernissionRelevancyMapper {
    /**
     *
     * @mbg.generated 2020-03-07
     */
    long countByExample(SysRolePernissionRelevancyExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int deleteByExample(SysRolePernissionRelevancyExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int insert(SysRolePernissionRelevancy record);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int insertSelective(SysRolePernissionRelevancy record);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    List<SysRolePernissionRelevancy> selectByExample(SysRolePernissionRelevancyExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    SysRolePernissionRelevancy selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int updateByExampleSelective(@Param("record") SysRolePernissionRelevancy record, @Param("example") SysRolePernissionRelevancyExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int updateByExample(@Param("record") SysRolePernissionRelevancy record, @Param("example") SysRolePernissionRelevancyExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int updateByPrimaryKeySelective(SysRolePernissionRelevancy record);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int updateByPrimaryKey(SysRolePernissionRelevancy record);
}