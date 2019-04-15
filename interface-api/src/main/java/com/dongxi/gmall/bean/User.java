package com.dongxi.gmall.bean;

import java.io.Serializable;

/**
 * 用户地址
 * @author lfy
 *
 */
public class User implements Serializable {
	
    private String userAddress; //用户地址
    private String userId; //用户id
    private String consignee; //收货人
    private String billId; //电话号码
    private String isDefault; //是否为默认地址    Y-是     N-否
    
    public User() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public User(Integer id, String userAddress, String userId, String consignee, String phoneNum,
                       String isDefault) {
		super();
		this.userAddress = userAddress;
		this.userId = userId;
		this.consignee = consignee;
		this.billId = phoneNum;
		this.isDefault = isDefault;
	}
	

	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getPhoneNum() {
		return billId;
	}
	public void setPhoneNum(String phoneNum) {
		this.billId = phoneNum;
	}
	public String getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}
    
    


}
