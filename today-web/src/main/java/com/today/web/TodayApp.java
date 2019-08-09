package com.today.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * ^---^---^---^---^---^---^---^
 * --v---v---v---v---v---v---v--
 *
 * @author zou.cp
 * @version 1.0
 * @Description
 * @createTime 2019年08月02日 18:33*
 * log.info()
 */
@Configuration
@SpringBootApplication
public class TodayApp {

    public static void main(String[] args) {
        SpringApplication.run(TodayApp.class, args);
        System.out.println("启动成功……");
    }

}
