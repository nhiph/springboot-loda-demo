package dev.nhiph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo5Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Demo5Application.class, args);

//        DatabaseConnector mysql = (DatabaseConnector) context.getBean("mySqlConnector");
//        mysql.connect();

        DatabaseConnector mongodb = (DatabaseConnector) context.getBean("mongodbConnector");
        mongodb.connect();

        DatabaseConnector postgresql = (DatabaseConnector) context.getBean("postgresqlConnector");
        postgresql.connect();
    }
}
