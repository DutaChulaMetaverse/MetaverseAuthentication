package org.ukdw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Tag;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
public class SwaggerConfig {

    public static final String AUTH_SERVICE_TAG = "Authentikasi";

//
//    @Bean
//    public Docket authenticationApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("org.ukdw.controller"))
//                .build()
//                .apiInfo(metadata())
//                .tags(new Tag(AUTH_SERVICE_TAG,"API untuk operasi otentikfikasi"));
//
//    }
//
//    private ApiInfo metadata() {
//        return new ApiInfoBuilder()
//                .title("OAuth2 Base API")
//                .description("OAuth2 Based API documentation")
//                .build();
//    }
}
