package dev.nhiph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo3Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Demo3Application.class, args);

        // Lấy ra bean GirlService
        GirlService girlService = context.getBean(GirlService.class);
        System.out.println("GirlService: " + girlService);
        // Lấu ra random một cô gái từ tầng service
        Girl girl = girlService.getRandomGirl();
        // In ra màn hình
        System.out.println(girl);
    }

}
