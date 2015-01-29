package com.ly.hs.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ly.hs.entity.Hotel;
import com.ly.hs.service.HotelService;

@Controller
public class HotelController {

	@Resource
	private HotelService hotelServiceImpl;
	
	@RequestMapping("/hotel/save")
	public String save(Hotel hotel){
		if(hotel != null){
			System.out.println(hotel);
		}
		this.hotelServiceImpl.save(hotel);
		return "/hotel/save_success";
	}
	
	@RequestMapping("/hotel/list")
	public String list(){
		return "/hotel/list";
	}
}
