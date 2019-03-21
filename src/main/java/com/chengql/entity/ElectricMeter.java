package com.chengql.entity;

import java.util.Date;

import lombok.Data;

/**
 * 电表度数
 * @author chengql
 *
 */
@Data
public class ElectricMeter {
	/**
	 * 
	 */
	private Integer id;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 度数
	 */
	private Float meter;

}
