package oop;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    private boolean teen;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return firstName + lastName;
    }

    public boolean isTeen() {
        return age >= 18;
    }
}
