package com.chengql.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chengql.entity.ElectricMeter;
import com.chengql.mapper.ElectricMeterMapper;
import com.chengql.service.IElectricMeterService;
@Service
public class ElectricMeterServiceImpl extends ServiceImpl<ElectricMeterMapper, ElectricMeter> implements IElectricMeterService{
	public boolean deleteAll() {
		return retBool(baseMapper.deleteAll());
	}

	@Override
	public List<ElectricMeter> selectListBySQL() {
		return baseMapper.selectListBySQL();
	}

	@Override
	public List<ElectricMeter> selectListByWrapper(Wrapper wrapper) {
		return baseMapper.selectListByWrapper(wrapper);
	}
}
