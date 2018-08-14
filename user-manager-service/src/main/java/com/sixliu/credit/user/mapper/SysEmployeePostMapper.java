package com.sixliu.credit.user.mapper;

import com.sixliu.credit.user.entity.SysEmployeePostExample;
import com.sixliu.credit.user.entity.SysEmployeePostKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysEmployeePostMapper {
    long countByExample(SysEmployeePostExample example);

    int deleteByExample(SysEmployeePostExample example);

    int deleteByPrimaryKey(SysEmployeePostKey key);

    int insert(SysEmployeePostKey record);

    int insertSelective(SysEmployeePostKey record);

    List<SysEmployeePostKey> selectByExample(SysEmployeePostExample example);

    int updateByExampleSelective(@Param("record") SysEmployeePostKey record, @Param("example") SysEmployeePostExample example);

    int updateByExample(@Param("record") SysEmployeePostKey record, @Param("example") SysEmployeePostExample example);
}