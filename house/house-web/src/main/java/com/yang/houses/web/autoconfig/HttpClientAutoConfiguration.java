package com.yang.houses.web.autoconfig;

import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.NoConnectionReuseStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: yang
 * @Date: 2018\7\19 0019 09:58
 * @Description:
 */
@Configuration
@ConditionalOnClass(HttpClient.class)
@EnableConfigurationProperties(HttpClientProperties.class)
public class HttpClientAutoConfiguration {

    private final  HttpClientProperties properties;

    public HttpClientAutoConfiguration(HttpClientProperties properties){
        this.properties = properties;
    }

    /**
     * httpClient bean的定义
     * @return
     */
    @Bean
    @ConditionalOnMissingBean(HttpClient.class)
    public HttpClient httpClient(){
        //构建requestConfig
        RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(properties.getConnectTimeOut())
                .setConnectTimeout(properties.getSocketTimeOut()).build();
        HttpClient client = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).setUserAgent(properties.getAgent())
                .setMaxConnPerRoute(properties.getMaxConnPerRoute()).setConnectionReuseStrategy(new NoConnectionReuseStrategy()).build();
        return  client;
    }



}
