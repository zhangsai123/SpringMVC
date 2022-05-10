package zhang.spring.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String userName;

    private int age;

    private char sex;

    private String id;

    private String phoneNum;

    private String address;

    private String email;

    public User() {
    }

}
