package com.zjk.store.storemember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.zjk.store.storemember.feign")
public class StoreMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(StoreMemberApplication.class,args);
    }
}
