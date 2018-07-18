package com.yang.houses.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yang.houses.common.model.User;

/**   
* Copyright: Copyright (c) 2018 LanRu-Caifu
* @ClassName: UserMapper.java
* @Description: 该类的功能描述
* @version: v1.0.0
* @author: yang
* @date: 2018年7月18日 下午2:30:33 
*/
@Mapper
public interface UserMapper {
	
	List<User> selectUser();

}
