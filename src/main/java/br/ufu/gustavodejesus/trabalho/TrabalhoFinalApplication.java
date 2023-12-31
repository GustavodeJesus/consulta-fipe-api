package br.ufu.gustavodejesus.trabalho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TrabalhoFinalApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrabalhoFinalApplication.class, args);
    }

}
