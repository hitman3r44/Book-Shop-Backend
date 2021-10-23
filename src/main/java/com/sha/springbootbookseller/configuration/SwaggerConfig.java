package com.sha.springbootbookseller.configuration;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
//@EnableSwagger2WebMvc
public class SwaggerConfig {
//    ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("Swagger Petstore")
//                .description("This is a sample server Petstore server.  You can find out more about     Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).      For this sample, you can use the api key `special-key` to test the authorization     filters.")
//                .license("Apache 2.0")
//                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
//                .termsOfServiceUrl("")
//                .version("1.0.0")
//                .contact(new Contact("","", "apiteam@swagger.io"))
//                .build();
//    }

//    @Bean
//    public Docket testApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("test")
//                .genericModelSubstitutes(DeferredResult.class)
//                .useDefaultResponseMessages(false)
//                .forCodeGeneration(true)
//                .pathMapping("/")// base，最终调用接口后会和paths拼接在一起
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.sha.springbootbookseller"))
//                .build();
//    }

//    @Bean
//    public Docket adminApi(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("Admin API")
//                .forCodeGeneration(true)
//                .pathMapping("/")
//                .select()
//                .paths(paths())
//                .build()
//                .apiInfo(apiInfo())
//                .useDefaultResponseMessages(false);
//    }
//
//    private Predicate<String> paths(){
//        return Predicates.and(PathSelectors.regex("/.*"), Predicates.not(PathSelectors.regex("/error")));
//    }
//
//
//    private ApiInfo apiInfo(){
//        Contact contact = new Contact("lance", "https://github.com/leelance", "81222045@qq.com");
//        return new ApiInfoBuilder()
//                .title("Document Api")
//                .description("Spring-boot-Springfox Example")
//                .license("Apache License Version 2.0")
//                .contact(contact)
//                .version("2.0")
//                .build();
//    }
}