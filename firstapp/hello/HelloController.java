package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author amruta.kajrekar on 6/17/18.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "hello and welcome to Spring boot application!\n";
    }
}
