package jobs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = { "jobs" })
@EnableAutoConfiguration
@EnableDiscoveryClient
//@EnableOAuth2Sso
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
