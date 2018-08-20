package com.sixliu.credit.user.mapper;

import com.sixliu.credit.user.entity.SysRoleMenuExample;
import com.sixliu.credit.user.entity.SysRoleMenuKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysRoleMenuMapper {
    long countByExample(SysRoleMenuExample example);

    int deleteByExample(SysRoleMenuExample example);

    int deleteByPrimaryKey(SysRoleMenuKey key);

    int insert(SysRoleMenuKey record);

    int insertSelective(SysRoleMenuKey record);

    List<SysRoleMenuKey> selectByExample(SysRoleMenuExample example);

    int updateByExampleSelective(@Param("record") SysRoleMenuKey record, @Param("example") SysRoleMenuExample example);

    int updateByExample(@Param("record") SysRoleMenuKey record, @Param("example") SysRoleMenuExample example);
}