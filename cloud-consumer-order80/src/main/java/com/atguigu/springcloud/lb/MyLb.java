package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: cloud2020
 * @description: 轮询实现类
 * @author: Mr.Liu
 * @create: 2021-04-11 20:16
 **/
@Component
public class MyLb implements LoadBalancer{

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private final int getAndIncrement(int size){
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = (current + 1) % size;
        }while (!this.atomicInteger.compareAndSet(current,next ));
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = this.getAndIncrement(serviceInstances.size());
        return serviceInstances.get(index);
    }
}

