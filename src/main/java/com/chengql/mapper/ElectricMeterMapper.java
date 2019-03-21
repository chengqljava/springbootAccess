package com.chengql.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chengql.entity.ElectricMeter;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.conditions.Wrapper;


public interface ElectricMeterMapper extends BaseMapper<ElectricMeter>{
	int deleteAll();

    @Select("select id, meter, create_date AS createDate from meter")
    List<ElectricMeter> selectListBySQL();

    List<ElectricMeter> selectListByWrapper(@Param("ew") Wrapper wrapper);
}
