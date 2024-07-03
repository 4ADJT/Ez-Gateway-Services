package br.com.ezblue.ezgatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@SpringBootApplication
public class EzGatewayServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(EzGatewayServicesApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("ez_client_service", r -> r.path("/clients/**")
                        .uri("lb://EZ-CLIENT-SERVICES"))
                .route("ez_blue_service", r -> r.path("/locations/**")
                        .uri("lb://EZ-BLUE-SERVICES"))
                .build();
    }

}
