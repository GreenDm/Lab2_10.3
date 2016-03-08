package com.epam;

/**
 * Created by Hrinchenko on 08.03.2016.
 */
public class Main {
    public static void main(String[] args) {

Person man1 = new Person();

        try{
            man1.setAge(120);
        }catch(InvalidAgeException a){
            a.printMessage();
        }
        System.out.println(man1.getAge());
    }
}
