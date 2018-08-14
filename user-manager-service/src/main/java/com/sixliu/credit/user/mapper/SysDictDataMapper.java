package com.sixliu.credit.user.mapper;

import com.sixliu.credit.user.entity.SysDictData;
import com.sixliu.credit.user.entity.SysDictDataExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysDictDataMapper {
    long countByExample(SysDictDataExample example);

    int deleteByExample(SysDictDataExample example);

    int deleteByPrimaryKey(String dictCode);

    int insert(SysDictData record);

    int insertSelective(SysDictData record);

    List<SysDictData> selectByExample(SysDictDataExample example);

    SysDictData selectByPrimaryKey(String dictCode);

    int updateByExampleSelective(@Param("record") SysDictData record, @Param("example") SysDictDataExample example);

    int updateByExample(@Param("record") SysDictData record, @Param("example") SysDictDataExample example);

    int updateByPrimaryKeySelective(SysDictData record);

    int updateByPrimaryKey(SysDictData record);
}