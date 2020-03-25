package com.qdz.hop.mapper.sys.mapper;

import com.qdz.hop.po.sys.po.SysAdminRole;
import com.qdz.hop.po.sys.po.SysAdminRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAdminRoleMapper {
    /**
     *
     * @mbg.generated 2020-03-07
     */
    long countByExample(SysAdminRoleExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int deleteByExample(SysAdminRoleExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int insert(SysAdminRole record);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int insertSelective(SysAdminRole record);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    List<SysAdminRole> selectByExample(SysAdminRoleExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    SysAdminRole selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int updateByExampleSelective(@Param("record") SysAdminRole record, @Param("example") SysAdminRoleExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int updateByExample(@Param("record") SysAdminRole record, @Param("example") SysAdminRoleExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int updateByPrimaryKeySelective(SysAdminRole record);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int updateByPrimaryKey(SysAdminRole record);
}