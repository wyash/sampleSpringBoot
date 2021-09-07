import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

//SpringBoot Anotations
@RestController
@EnableAutoConfiguration
public class Example {

// to print Hello World

    @RequestMapping("/")
    String home() {

        return "Hello World - v3!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}

