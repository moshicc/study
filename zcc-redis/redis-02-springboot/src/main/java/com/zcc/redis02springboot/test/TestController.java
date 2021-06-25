package com.zcc.redis02springboot.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zcc.redis02springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zcc
 * @ClassName TestController
 * @description
 * @date 2021/3/31 18:22
 * @Version 1.0
 */
@Controller
@ResponseBody
public class TestController {
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("get")
    public Object getStr(){
//        int num = 10;
//        for (int i = 0; i < num ; i++) {
//            redisTemplate.opsForList().leftPush("list",i);
//        }

        List str = redisTemplate.opsForList().range("list",0,-1);
       // String str2 = (String) redisTemplate.randomKey();
        return str;
    }
    @RequestMapping("user")
    public Object user(){
        User user = new User("zcc",18);
        //序列化，转为json对象
        String str = "";
        try {
            //序列化，转为json对象.如果直接传输user 对象 ，会报对象没有序列化的错误
            String jsonUser = new ObjectMapper().writeValueAsString(user);
            redisTemplate.opsForValue().set("user",jsonUser);
             str = (String) redisTemplate.opsForValue().get("user");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

       // List str = redisTemplate.opsForList().range("list",0,-1);
        // String str2 = (String) redisTemplate.randomKey();
        return str;
    }
}
