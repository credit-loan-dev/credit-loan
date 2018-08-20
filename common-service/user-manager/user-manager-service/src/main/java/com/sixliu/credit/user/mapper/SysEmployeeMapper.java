package com.sixliu.credit.user.mapper;

import com.sixliu.credit.user.entity.SysEmployee;
import com.sixliu.credit.user.entity.SysEmployeeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysEmployeeMapper {
    long countByExample(SysEmployeeExample example);

    int deleteByExample(SysEmployeeExample example);

    int deleteByPrimaryKey(String empCode);

    int insert(SysEmployee record);

    int insertSelective(SysEmployee record);

    List<SysEmployee> selectByExample(SysEmployeeExample example);

    SysEmployee selectByPrimaryKey(String empCode);

    int updateByExampleSelective(@Param("record") SysEmployee record, @Param("example") SysEmployeeExample example);

    int updateByExample(@Param("record") SysEmployee record, @Param("example") SysEmployeeExample example);

    int updateByPrimaryKeySelective(SysEmployee record);

    int updateByPrimaryKey(SysEmployee record);
}