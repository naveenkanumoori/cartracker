package com.naveen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by naveenkumar on 6/18/17.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).pathMapping("/").apiInfo(apiInfo());
    }
    private ApiInfo apiInfo(){
        Contact contact = new Contact("Naveen","www.naveen.com","kanumoorinaveen@gmail.com");
        ApiInfo info = new ApiInfo("City Weather API", "A Simple API to track details of vehicles", "1.0", "www.google.com", contact , "MIT", "http://www.mit.com");
        return info;
    }
}
