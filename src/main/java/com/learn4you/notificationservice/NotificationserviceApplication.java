package com.learn4you.notificationservice;

import com.learn4you.notificationservice.config.EnvLoader;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.support.converter.JsonMessageConverter;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class NotificationserviceApplication {

    public static void main(String[] args) {
//        // Load Environment Variables
//        Dotenv dotenv = Dotenv.load();
//        System.setProperty("MAIL_ADDRESS", dotenv.get("MAIL_ADDRESS"));
//        System.setProperty("MAIL_PASSWORD", dotenv.get("MAIL_PASSWORD"));

        EnvLoader.loadEnv();

        SpringApplication.run(NotificationserviceApplication.class, args);
    }

    @Bean
    public JsonMessageConverter converter() {
        return new JsonMessageConverter();
    }

}