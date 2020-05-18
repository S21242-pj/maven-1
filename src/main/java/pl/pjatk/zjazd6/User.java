package pl.pjatk.zjazd6;

import javax.validation.constraints.NotNull;

public class User {

    @NotNull(message = "Name cannot be null")
    private String name;

    @SomeAnnotation(key = "testuje cie")
    private String test;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
