package com.sixliu.credit.user.mapper;

import com.sixliu.credit.user.entity.SysUserDataScopeExample;
import com.sixliu.credit.user.entity.SysUserDataScopeKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserDataScopeMapper {
    long countByExample(SysUserDataScopeExample example);

    int deleteByExample(SysUserDataScopeExample example);

    int deleteByPrimaryKey(SysUserDataScopeKey key);

    int insert(SysUserDataScopeKey record);

    int insertSelective(SysUserDataScopeKey record);

    List<SysUserDataScopeKey> selectByExample(SysUserDataScopeExample example);

    int updateByExampleSelective(@Param("record") SysUserDataScopeKey record, @Param("example") SysUserDataScopeExample example);

    int updateByExample(@Param("record") SysUserDataScopeKey record, @Param("example") SysUserDataScopeExample example);
}