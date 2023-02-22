package com.artemkurovskyi.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(
        scanBasePackages = {
                "com.artemkurovskyi.amqp",
                "com.artemkurovskyi.notification"
        }
)
@EnableEurekaClient
@EnableFeignClients( basePackages = "com.artemkurovskyi.clients")
public class NotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(
//            RabbitMQMessageProducer producer,
//            NotificationConfig notificationConfig
//    ) {
//        return args -> {
//            producer.publish("payload", notificationConfig.getInternalExchange(), notificationConfig.getInternalNotificationRoutingKey());
//        };
//    }
}
