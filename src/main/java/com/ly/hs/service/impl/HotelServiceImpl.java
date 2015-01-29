package com.ly.hs.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ly.hs.dao.BaseDao;
import com.ly.hs.dao.HotelDao;
import com.ly.hs.entity.Hotel;
import com.ly.hs.service.HotelService;

@Service
public class HotelServiceImpl extends BaseServiceImpl<Hotel> implements HotelService {

	@Resource
	private HotelDao hotelDaoImpl;

	@Resource
	public void setBaseDao(BaseDao<Hotel> hotelDaoImpl) {
		super.setBaseDao(hotelDaoImpl);
	}
	
}
