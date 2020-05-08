package test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import test.MyMethodClassService;

import javax.annotation.PostConstruct;

@Component
public class PostConstructTest {
    private static PostConstructTest staticInstance = new PostConstructTest();

    @Autowired
    private MyMethodClassService myService;

    @PostConstruct
    public void init() {
        staticInstance.myService = myService;
    }

    public static void invokeBean() {
        staticInstance.myService.add(10, 20);
    }
}

