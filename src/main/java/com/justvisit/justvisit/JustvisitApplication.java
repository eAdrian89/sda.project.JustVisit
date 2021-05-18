package com.justvisit.justvisit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class JustvisitApplication {

    public static void main(String[] args) {
        SpringApplication.run(JustvisitApplication.class, args);
        log.info("App has started! - Enjoy:-)");
    }

}
