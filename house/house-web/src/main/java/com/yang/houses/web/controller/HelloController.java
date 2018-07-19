/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 功能描述：
 * @Package: com.yang.houses.controller 
 * @author: yang
 * @date: 2018年7月18日 下午4:36:42 
 */
package com.yang.houses.web.controller;


import com.yang.houses.common.model.User;
import com.yang.houses.biz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
* Copyright: Copyright (c) 2018 LanRu-Caifu
* @ClassName: HelloController.java
* @Description: 该类的功能描述
* @version: v1.0.0
* @author: yang
* @date: 2018年7月18日 下午4:36:42 
*/
@Controller
public class HelloController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/hello")
	public String hello(ModelMap modelMap){
		List<User> users = userService.getUser();
		User one = users.get(0);
		modelMap.put("user", one);
		return "hello";
	}
	
	@RequestMapping("/index")
	public String index(){
		return "homepage/index";
	}
	
	

}
