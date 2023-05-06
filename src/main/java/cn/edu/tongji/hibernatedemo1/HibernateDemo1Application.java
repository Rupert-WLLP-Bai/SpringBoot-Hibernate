package cn.edu.tongji.hibernatedemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableWebMvc
@EnableOpenApi
public class HibernateDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(HibernateDemo1Application.class, args);
    }

}
