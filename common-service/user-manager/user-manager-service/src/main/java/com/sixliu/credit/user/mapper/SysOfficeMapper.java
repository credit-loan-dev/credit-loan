package com.sixliu.credit.user.mapper;

import com.sixliu.credit.user.entity.SysOffice;
import com.sixliu.credit.user.entity.SysOfficeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysOfficeMapper {
    long countByExample(SysOfficeExample example);

    int deleteByExample(SysOfficeExample example);

    int deleteByPrimaryKey(String officeCode);

    int insert(SysOffice record);

    int insertSelective(SysOffice record);

    List<SysOffice> selectByExample(SysOfficeExample example);

    SysOffice selectByPrimaryKey(String officeCode);

    int updateByExampleSelective(@Param("record") SysOffice record, @Param("example") SysOfficeExample example);

    int updateByExample(@Param("record") SysOffice record, @Param("example") SysOfficeExample example);

    int updateByPrimaryKeySelective(SysOffice record);

    int updateByPrimaryKey(SysOffice record);
}