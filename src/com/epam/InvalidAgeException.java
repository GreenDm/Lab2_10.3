package com.epam;

/**
 * Created by Hrinchenko on 08.03.2016.
 */
public class InvalidAgeException extends RuntimeException {
    String message;

    public InvalidAgeException (String message) {
        this.message = message;
    }

    public void printMessage(){
        System.out.println(message);
    }

}
