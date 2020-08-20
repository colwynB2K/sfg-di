package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) { // Using Constructor injection without specifying @Autowired, we also don't use a qualifier to specify which GreetingService implementation we want
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
