package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class configSwagger {
//
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("full-petstore-api")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(regex("/"))
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API")
                .description("Service API")
                .termsOfServiceUrl("http://springfox.io")
                .contact(new Contact("nome", "url", "email"))
                .license("License Version 2.0")
                .licenseUrl("https://mvcrepository.com")
                .version("1.0")
                .build();
    }


    }


