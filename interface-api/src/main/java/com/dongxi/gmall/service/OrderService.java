package com.dongxi.gmall.service;



import com.dongxi.gmall.bean.User;

import java.util.List;


public interface OrderService {
	
	/**
	 * 初始化订单
	 * @param userId
	 */
	public List<User> initOrder(String userId);

}
