package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class Spring5RecipeAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(Spring5RecipeAppApplication.class, args);
    }

}
