package runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.swing.event.ListSelectionEvent;
import java.util.List;

@SpringBootApplication//申明这是一个Spring Boot项目
@ComponentScan(basePackages = {"com.controller"})//手动指定bean组件扫描范围
public class Main {
    public static void main(String[] args) {
        String my="890809";
        //List<String> list= List
        SpringApplication.run(Main.class, args);
    }
}
