package com.zcc.redis02springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author zcc
 * @ClassName User
 * @description
 * @date 2021/4/1 12:51
 * @Version 1.0
 */
@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private String name;
    private int age;
}
