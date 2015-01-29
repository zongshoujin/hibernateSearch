package com.ly.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ly.hs.entity.Hotel;
import com.ly.hs.service.HotelService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/beans.xml"})
public class HotelServiceTest extends AbstractJUnit4SpringContextTests {

	@Resource
	private HotelService hotelServiceImpl;
	
	@Test
	public void testSave(){
		Hotel hotel = new Hotel();
		hotel.setName("凯宾四季大酒店");
		hotel.setAddress("三香路99号");
		hotel.setOneWord("是一家很好的酒店");
		hotel.setPrice(999);
		
		this.hotelServiceImpl.save(hotel);
	}
}
