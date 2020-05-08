package test;

import org.springframework.stereotype.Service;

@Service
public class MyMethodClassService {
    public void add(int a, int b) {
        int result = a + b;
        System.out.println(a + "+" + b + "=" + result);

    }

}
