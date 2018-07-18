/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 功能描述：
 * @Package: com.yang.houses.service 
 * @author: yang
 * @date: 2018年7月18日 下午2:42:43 
 */
package com.yang.houses.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yang.houses.common.model.User;
import com.yang.houses.mapper.UserMapper;

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
	
		
	@Override
	public List<User> getUser() {
		return usermapper.selectUser();
	}

}
