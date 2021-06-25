package com.test;

import redis.clients.jedis.Jedis;

/**
 * @author zcc
 * @ClassName TestPing
 * @description
 * @date 2021/3/30 12:49
 * @Version 1.0
 */
/* *
 *  关于redis 远程连接说明：修改redis.config 配置文件
 * 1：设置redis密码，把requirepass 放出后，后面加123456（密码）
 * 2：bind 127.0.0.1 注释掉
 * 3：阿里云配置安全组，把6379端口放出来
 * ------
 * 配置好了之后，使用该配置文件启动redis
 * 用redis-cli 进去 ,进去之后 执行auth 123456  看密码是否启用后，在ping
 */
public class TestPing {
    public static void main(String[] args) {

        //1. new Jedis 对象
        Jedis jedis = new Jedis("47.93.228.227",6379);
       // Jedis jedis = new Jedis("127.0.0.1",6379);
       jedis.auth("123456");
       System.out.println(jedis.ping());
    }
}
