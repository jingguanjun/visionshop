package com.vito16.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vito16.shop.model.Shop;
import com.vito16.shop.repository.ShopRepository;

@Service
public class ShopService {
	
	@Autowired
	private ShopRepository shopDao;

	public Shop findShop(Integer shopId){
		
		return shopDao.findOne(shopId);
	}
}
