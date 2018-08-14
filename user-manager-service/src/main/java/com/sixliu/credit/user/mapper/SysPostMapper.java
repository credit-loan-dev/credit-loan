package com.sixliu.credit.user.mapper;

import com.sixliu.credit.user.entity.SysPost;
import com.sixliu.credit.user.entity.SysPostExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysPostMapper {
    long countByExample(SysPostExample example);

    int deleteByExample(SysPostExample example);

    int deleteByPrimaryKey(String postCode);

    int insert(SysPost record);

    int insertSelective(SysPost record);

    List<SysPost> selectByExample(SysPostExample example);

    SysPost selectByPrimaryKey(String postCode);

    int updateByExampleSelective(@Param("record") SysPost record, @Param("example") SysPostExample example);

    int updateByExample(@Param("record") SysPost record, @Param("example") SysPostExample example);

    int updateByPrimaryKeySelective(SysPost record);

    int updateByPrimaryKey(SysPost record);
}