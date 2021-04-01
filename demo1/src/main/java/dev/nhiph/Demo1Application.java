package dev.nhiph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo1Application {


    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Demo1Application.class, args);
        // Khi chạy xong, lúc này context sẽ chứa các Bean có đánh
        // dấu @Component.

        // Lấy Bean ra bằng cách
        Outfit outfit = context.getBean(Outfit.class);

        // In ra để xem thử nó là gì
        System.out.println("Instance: " + outfit);
        // xài hàm wear()
        outfit.wear();
    }

}
