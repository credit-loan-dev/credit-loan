package com.sixliu.credit.user.mapper;


import com.sixliu.credit.user.entity.SysDictType;
import com.sixliu.credit.user.entity.SysDictTypeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysDictTypeMapper {
    long countByExample(SysDictTypeExample example);

    int deleteByExample(SysDictTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysDictType record);

    int insertSelective(SysDictType record);

    List<SysDictType> selectByExample(SysDictTypeExample example);

    SysDictType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysDictType record, @Param("example") SysDictTypeExample example);

    int updateByExample(@Param("record") SysDictType record, @Param("example") SysDictTypeExample example);

    int updateByPrimaryKeySelective(SysDictType record);

    int updateByPrimaryKey(SysDictType record);
}