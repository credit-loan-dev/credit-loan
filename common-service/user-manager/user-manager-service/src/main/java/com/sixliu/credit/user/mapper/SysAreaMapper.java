package com.sixliu.credit.user.mapper;


import com.sixliu.credit.user.entity.SysArea;
import com.sixliu.credit.user.entity.SysAreaExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysAreaMapper {
    long countByExample(SysAreaExample example);

    int deleteByExample(SysAreaExample example);

    int deleteByPrimaryKey(String areaCode);

    int insert(SysArea record);

    int insertSelective(SysArea record);

    List<SysArea> selectByExample(SysAreaExample example);

    SysArea selectByPrimaryKey(String areaCode);

    int updateByExampleSelective(@Param("record") SysArea record, @Param("example") SysAreaExample example);

    int updateByExample(@Param("record") SysArea record, @Param("example") SysAreaExample example);

    int updateByPrimaryKeySelective(SysArea record);

    int updateByPrimaryKey(SysArea record);
}