package com.sixliu.credit.user.mapper;

import com.sixliu.credit.user.entity.SysRoleDataScopeExample;
import com.sixliu.credit.user.entity.SysRoleDataScopeKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysRoleDataScopeMapper {
    long countByExample(SysRoleDataScopeExample example);

    int deleteByExample(SysRoleDataScopeExample example);

    int deleteByPrimaryKey(SysRoleDataScopeKey key);

    int insert(SysRoleDataScopeKey record);

    int insertSelective(SysRoleDataScopeKey record);

    List<SysRoleDataScopeKey> selectByExample(SysRoleDataScopeExample example);

    int updateByExampleSelective(@Param("record") SysRoleDataScopeKey record, @Param("example") SysRoleDataScopeExample example);

    int updateByExample(@Param("record") SysRoleDataScopeKey record, @Param("example") SysRoleDataScopeExample example);
}