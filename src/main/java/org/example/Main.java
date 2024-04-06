package org.example;


public class Main {

    public static void main(String[] args) {
        int x = 150;
        System.out.println("x equals: "+x);
        Integer integerWrapper = 23;
        System.out.println("integerWrapper equals: " + integerWrapper);

        long byteValueFromWrapper = integerWrapper.byteValue();
        long byteValue = (byte)x;

        System.out.println("byteValueFromWrapper equals: "+ byteValueFromWrapper);
        System.out.println("byteValue equals: " + byteValue);

        String name = "Denys";
        byte age = 26;

        System.out.println("Name: " + name +", Age: " + age);


    }
}

