/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 功能描述：
 * @Package: com.yang.houses.service 
 * @author: yang
 * @date: 2018年7月18日 下午2:42:09 
 */
package com.yang.houses.biz.service;

import java.util.List;

import com.yang.houses.common.model.User;

/**   
* Copyright: Copyright (c) 2018 LanRu-Caifu
* @ClassName: UserService.java
* @Description: 该类的功能描述
* @version: v1.0.0
* @author: yang
* @date: 2018年7月18日 下午2:42:09 
*/
public interface UserService {
	
	/**
	 * 
	* @Function: UserService.java
	* @Description:获取所有用户类列表
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: yang
	* @date: 2018年7月18日 下午2:43:48
	 */
	List<User> getUser();

}
