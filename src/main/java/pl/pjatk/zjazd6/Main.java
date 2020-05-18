package pl.pjatk.zjazd6;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        User user = new User("My name is potato");
        user.setTest("Testing this value");
        System.out.println(user.getName());
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<User>> violations = validator.validate(user);
        if (violations.isEmpty()) {
            System.out.println("Is OK");
        } else {
            System.out.println(violations);
        }
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();
        Box<User> userBox = new Box<>();

        integerBox.set(10);
        stringBox.set("Im string");
        userBox.set(user);

        System.out.println("Integer value: " + integerBox.get());
        System.out.println("String value: " + stringBox.get());
        System.out.println("User name value: " + userBox.get().getName());
    }
}
