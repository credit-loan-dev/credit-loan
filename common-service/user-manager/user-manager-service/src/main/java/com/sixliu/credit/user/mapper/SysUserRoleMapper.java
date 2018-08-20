package com.sixliu.credit.user.mapper;

import com.sixliu.credit.user.entity.SysUserRoleExample;
import com.sixliu.credit.user.entity.SysUserRoleKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserRoleMapper {
    long countByExample(SysUserRoleExample example);

    int deleteByExample(SysUserRoleExample example);

    int deleteByPrimaryKey(SysUserRoleKey key);

    int insert(SysUserRoleKey record);

    int insertSelective(SysUserRoleKey record);

    List<SysUserRoleKey> selectByExample(SysUserRoleExample example);

    int updateByExampleSelective(@Param("record") SysUserRoleKey record, @Param("example") SysUserRoleExample example);

    int updateByExample(@Param("record") SysUserRoleKey record, @Param("example") SysUserRoleExample example);
}