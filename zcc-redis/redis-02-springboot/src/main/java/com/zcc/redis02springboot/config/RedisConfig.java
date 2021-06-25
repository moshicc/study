package com.zcc.redis02springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author zcc
 * @ClassName RedisConfig
 * @description 自己重新的redisTemplate
 * @date 2021/4/1 12:45
 * @Version 1.0
 */
@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> template = new RedisTemplate();


        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }
}
