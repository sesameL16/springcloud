package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: cloud2020
 * @description: 支付实体类
 * @author: Mr.Liu
 * @create: 2021-04-07 21:07
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable  {

    private Long id;

    private String serial;
}

