package configuration

import java.util.Arrays;
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@EnableAutoConfiguration
@ComponentScan('hello')
class Application {

    static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        println "Let's inspect the beans provided by Spring Boot:"

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        beanNames.each { beanName -> println beanName }
    }
}
