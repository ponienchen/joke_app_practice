package peter.spring.joke.jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//The "controllers" folder is, by default, expected to be in the same
//folder as this @SpringBootApplication-annotated class.
//However, since that is not the case, we need to add the @ComponentScan
//to tell this class where to find the components.
@ComponentScan(basePackages = {"peter.spring.joke"})
public class JokeappApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokeappApplication.class, args);
    }

}
