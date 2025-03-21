package org.example.szs_kyungdoma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SzsKyungdomaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SzsKyungdomaApplication.class, args);
    }

}
