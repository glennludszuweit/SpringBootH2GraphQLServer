package com.project.bugzilla;

import com.project.bugzilla.entity.Application;
import com.project.bugzilla.repository.ApplicationRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.logging.Logger;

@SpringBootApplication
public class BugzillaApplication {
    public static void main(String[] args) {
        SpringApplication.run(BugzillaApplication.class, args);
        System.out.println("Hello world!");
    }
}
