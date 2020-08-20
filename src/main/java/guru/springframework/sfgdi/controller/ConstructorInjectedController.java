package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.service.GreetingService;

public class ConstructorInjectedController {

    private final GreetingService greetingService; // NOTE the final keyword here which prevents that this variable is changed after it was assigned

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
