/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 功能描述：
 * @Package: com.yang.houses.service 
 * @author: yang
 * @date: 2018年7月18日 下午2:42:43 
 */
package com.yang.houses.biz.service;

import java.util.List;

import com.yang.houses.biz.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yang.houses.common.model.User;

/**   
* Copyright: Copyright (c) 2018 LanRu-Caifu
* @ClassName: UserServiceImpl.java
* @Description: 该类的功能描述
* @version: v1.0.0
* @author: yang
* @date: 2018年7月18日 下午2:42:43 
*/
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper usermapper;


	/**
	 * 获取所有用户
	 * @return
	 */
	@Override
	public List<User> getUser() {
		return usermapper.selectUser();
	}

}
