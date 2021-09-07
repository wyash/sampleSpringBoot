import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {
<<<<<<< HEAD

 //To return Hello World
 
    @RequestMapping("/")
    String home() {
		System.out.println(" ");
=======
    
//TO Print Hello World
    
    @RequestMapping("/")
    String home() {
        System.out.println(" ");
>>>>>>> 33cbbe6019294434aaff9e6a72dee3693649c22b
        return "Hello World - v3!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
