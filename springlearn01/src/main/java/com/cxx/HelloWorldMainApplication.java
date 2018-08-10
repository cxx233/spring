package com.cxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName HelloWorldMainApplication
 * @Description TODO
 * @Author xujiaxi
 * @Date 2018/8/10 18:37
 * @Version 1.0
 */

// @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {

        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
