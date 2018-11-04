package sk.didi.hystrixproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
@Slf4j
public class HystrixprojectApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixprojectApplication.class, args);
    }
}

