package com.jklou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JklouApplication {

//    @RequestMapping("/")
//    String home() {
//        // return "This is JKLou Speaking !";
//        return "index";
//    }

    public static void main(String[] args) {
        SpringApplication.run(JklouApplication.class, args);
    }
}
