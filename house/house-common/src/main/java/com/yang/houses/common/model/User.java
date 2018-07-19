package com.yang.houses.common.model;

/**   
* Copyright: Copyright (c) 2018 LanRu-Caifu
* @ClassName: User.java
* @Description: 用户实体类
* @version: v1.0.0
* @author: yang
* @date: 2018年7月18日 下午2:24:39 
*/
public class User {
	
	private Long id;
	
	private String name;
	
	private String email;
	
	private String phone;
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}


	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Long getId() {
		return id;
	}

	 
	public void setId(Long id) {
		this.id = id;
	}
	
	

}
