package com.chengql.service;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chengql.entity.ElectricMeter;

public interface IElectricMeterService extends IService<ElectricMeter>{

	List<ElectricMeter> selectListByWrapper(Wrapper wrapper);

	List<ElectricMeter> selectListBySQL();

}
