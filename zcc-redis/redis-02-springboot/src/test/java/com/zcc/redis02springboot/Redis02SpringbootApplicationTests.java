package com.zcc.redis02springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Redis02SpringbootApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("username","张聪聪");
        for (int i = 0; i < 10; i++) {
            redisTemplate.opsForList().leftPush("myList",i);
        }
        System.out.println(redisTemplate.opsForList().range("myList",0, 9));
    }

}
