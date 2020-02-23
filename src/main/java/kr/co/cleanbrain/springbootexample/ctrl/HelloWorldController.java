package kr.co.cleanbrain.springbootexample.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Company: NANDSOFT
 * User: 노상현
 * Date: 2020-02-14
 * Time: 오후 3:17
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String sayHello(@RequestParam(value = "name") String name) {
        // http://localhost:8080/hello?name=Sanghyun
        return "Hello " + name + "!";
    }

}