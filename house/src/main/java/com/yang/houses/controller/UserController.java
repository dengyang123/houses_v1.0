/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 功能描述：
 * @Package: com.yang.houses.controller 
 * @author: yang
 * @date: 2018年7月18日 下午2:40:04 
 */
package com.yang.houses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yang.houses.common.model.User;
import com.yang.houses.service.UserService;

/**   
* Copyright: Copyright (c) 2018 LanRu-Caifu
* @ClassName: UserController.java
* @Description: 该类的功能描述
* @version: v1.0.0
* @author: yang
* @date: 2018年7月18日 下午2:40:04 
*/
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getuser")
	public List<User> getUser(){
		return userService.getUser();
	}

}
