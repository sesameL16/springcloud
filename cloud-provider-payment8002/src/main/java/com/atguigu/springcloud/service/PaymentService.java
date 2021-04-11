package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @program: cloud2020
 * @description: 支付服务接口
 * @author: Mr.Liu
 * @create: 2021-04-07 21:27
 **/
public interface PaymentService {

    /**
     * 插入
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);
}

