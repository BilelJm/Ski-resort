package tn.spring.bilelproject.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(infoAPI());

    }
    public Info infoAPI() {
        return new Info().title("SkiResort-Doc")
                .description("Bilel Jemai")
                .contact(contactAPI());

    }
    public Contact contactAPI() {
        return new Contact().name("4 ArcTic 2 ASI II")
                .email("bilel.jemai@esprit.tn")
                .url("https://www.linkedin.com/in/bilel-jemai-029950196/");
    }
//    @Bean
//    public GroupedOpenApi productPublicApi() {
//        return GroupedOpenApi.builder()
//
//                .group("Only Product Management API")
//                .pathsToMatch("/product/**")
//                .pathsToExclude("**")
//                .build();
//
//    }

}
