package com.qdz.hop.mapper.sys.mapper;

import com.qdz.hop.po.sys.po.SysAdminUser;
import com.qdz.hop.po.sys.po.SysAdminUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAdminUserMapper {
    /**
     *
     * @mbg.generated 2020-03-07
     */
    long countByExample(SysAdminUserExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int deleteByExample(SysAdminUserExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int insert(SysAdminUser record);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int insertSelective(SysAdminUser record);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    List<SysAdminUser> selectByExample(SysAdminUserExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    SysAdminUser selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int updateByExampleSelective(@Param("record") SysAdminUser record, @Param("example") SysAdminUserExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int updateByExample(@Param("record") SysAdminUser record, @Param("example") SysAdminUserExample example);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int updateByPrimaryKeySelective(SysAdminUser record);

    /**
     *
     * @mbg.generated 2020-03-07
     */
    int updateByPrimaryKey(SysAdminUser record);
}