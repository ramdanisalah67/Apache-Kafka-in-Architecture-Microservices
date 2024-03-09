package com.example.demo;


import com.example.demo.Config.Producer;
import com.example.demo.Config.WikiMediaChangeHandler;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }


    @GetMapping("welcome")
    public String welcome(){

        return "welcome salah-eddine to microservice-producer" ;
    }


    @Bean
    public CommandLineRunner commandLineRunner(Producer producer){
        return args -> {
            producer.sendMessage();
        };
    }
}
