package dev.nhiph;

import org.springframework.stereotype.Component;

/*
 Đánh dấu class bằng @Component
 Class này sẽ được Spring Boot hiểu là một Bean (hoặc dependency)
 Và sẽ được Spring Boot quản lý
*/
@Component
public class Bikini implements Outfit {
    @Override
    public void wear() {
        System.out.println("Mặc bikini");
    }
}