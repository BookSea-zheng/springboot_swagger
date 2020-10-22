package com.example.springboot_swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2 // 开启Swagger2(开关)
public class SwaggerConfig {
    @Bean
    public Docket docket1(){
        return  new Docket(DocumentationType.SWAGGER_2).groupName("分组一");
    }
    @Bean
    public Docket docket2(){
        return  new Docket(DocumentationType.SWAGGER_2).groupName("分组二");
    }
    @Bean
    public Docket docket3(){
        return  new Docket(DocumentationType.SWAGGER_2).groupName("分组三");
    }
    //配置了Swagger的Docket实例
    @Bean
    public Docket docket(){
        return  new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //如果enable为false，则Swagger不能在浏览器中访问
//                .enable(false)
                .select()
                //RequestHandlerSelectors,配置扫描接口的方式
                //basePackage,指定要扫描的包
                //any,扫描全部
                //none,不扫描
                //withClassAnnotation,扫描类上的注解，参数是一个注解的反射对象
                //withMethodAnnotation,扫描方法上的注解
                .apis(RequestHandlerSelectors.basePackage("com.example.springboot_swagger.controller"))
                //paths()。过滤什么路径
//                .paths(PathSelectors.ant("/example/**"))
                .build();

    }
    //配置Swagger信息——ApiInfo
    private  ApiInfo apiInfo(){
        //作者信息
        Contact contact = new Contact("BookSea", "https://blog.csdn.net/bookssea", "123456789@qq.com");
        return new ApiInfo(
                "码农BookSea_SwaggerAPI",
                "点波关注不迷路",
                "1.0",
                "https://blog.csdn.net/bookssea",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList()
        );
    }
}
