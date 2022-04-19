package com.JerryZzhu.foranimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Jerry
 */
@SpringBootApplication
@EnableTransactionManagement
public class ForAnimalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForAnimalApplication.class, args);
    }

}
