package com.tensquare.split;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

/**
 * describe:
 *
 * @author lb
 * @date 2018/12/11
 */
@SpringBootApplication
@EnableEurekaClient
public class SplitApplication {
    public static void main(String[] args) {
        SpringApplication.run(SplitApplication.class,args);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1,1);
    }

}
