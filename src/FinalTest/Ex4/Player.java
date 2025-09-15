package FinalTest.Ex4;

import java.io.Serializable;

public class Player implements Serializable {
    private String name;
    private Integer age;
    private boolean isActive;

    public Player(String name, Integer age, boolean isActive) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isActive() {
        return isActive;
    }

    @Override
    public String toString() {
        return "name: " + name + "; age: " + age + "; isActive: " + isActive;
    }
}
