package demo;

/**
 * Created by krukat on 2015-09-22.
 */
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/ctrl")
    public Greeting index() {
        return new Greeting(1,"test");
    }

}
