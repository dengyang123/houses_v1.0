/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 功能描述：
 * @Package: com.yang.houses.config 
 * @author: yang
 * @date: 2018年7月18日 下午3:03:12 
 */
package com.yang.houses.biz.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.google.common.collect.Lists;

/**   
* Copyright: Copyright (c) 2018 LanRu-Caifu
* @ClassName: DruidConfig.java
* @Description: 该类的功能描述
* @version: v1.0.0
* @author: yang
* @date: 2018年7月18日 下午3:03:12 
*/
@Configuration
public class DruidConfig {
	
	@ConfigurationProperties(prefix="spring.datasource.druid")
	@Bean(initMethod="init",destroyMethod="close")
	public DruidDataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setProxyFilters(Lists.newArrayList(statFilter()));
		return dataSource;
	}
	
	@Bean
	public Filter statFilter() {
		StatFilter filter = new StatFilter();
		filter.setSlowSqlMillis(1);
		filter.setLogSlowSql(true);
		filter.setMergeSql(true);
		return filter;
	}
	
	
	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		return new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
	}
	
	
	

}
