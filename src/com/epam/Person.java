package com.epam;

/**
 * Created by Hrinchenko on 08.03.2016.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {

        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age > 120 || age < 1 ) throw new InvalidAgeException("Invalid age");
        this.age = age;
    }


}
