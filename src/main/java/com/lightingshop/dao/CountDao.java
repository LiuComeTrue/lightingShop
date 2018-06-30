package com.lightingshop.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lightingshop.dto.OrderLightCount;

public interface CountDao {

	List<OrderLightCount> selectCountLightByDate(@Param("dateStart") Integer i,@Param("dateEnd") Integer o);
	
	BigDecimal selectCountPriceByDate(@Param("dateStart") Integer i,@Param("dateEnd") Integer o);
}
