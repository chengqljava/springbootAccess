package com.chengql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chengql.entity.ElectricMeter;
import com.chengql.service.IElectricMeterService;

@RestController
public class MeterController {
	@Autowired
	private IElectricMeterService electricMeterService;
	@RequestMapping("/meter")
	@ResponseBody
	public List<ElectricMeter> meter(){
		List<ElectricMeter> electric=electricMeterService.selectListBySQL();
		return electric;
	}

}
