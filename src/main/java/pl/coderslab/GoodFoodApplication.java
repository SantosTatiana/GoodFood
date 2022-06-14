package pl.coderslab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication
public class GoodFoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodFoodApplication.class, args);
    }

}
