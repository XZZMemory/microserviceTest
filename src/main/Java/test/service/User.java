package test.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    String yourName;
    String sex;
    Integer yourAge;
}
