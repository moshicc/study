package com.zcc.redis02springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author zcc
 * @ClassName GetRedisTemplate
 * @description
 * @date 2021/3/31 18:59
 * @Version 1.0
 */

public class GetRedisTemplate {

    @Autowired
    RedisTemplate template;

    public RedisTemplate getRedis (){
        return template;
    }
}
