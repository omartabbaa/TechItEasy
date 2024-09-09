package nl.Tech.It.Easy.Tech.It.Easy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"nl.Tech.It.Easy.Tech.It.Easy.controllers", "nl.Tech.It.Easy.Tech.It.Easy.exceptions"})
public class TechItEasyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechItEasyApplication.class, args);
    }
}
