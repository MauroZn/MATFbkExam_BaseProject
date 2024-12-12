    package com.microservices.shopgateway;

    import org.springframework.beans.factory.annotation.Value;
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;

    @SpringBootApplication
    public class ShopGatewayApplication {

        @Value("${spring.data.mongodb.uri}")
        private String mongoUri;

        public static void main(String[] args) {
            SpringApplication.run(ShopGatewayApplication.class, args);
        }

    }
