package com.daca;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntValue = 5 /3;
        float myFloatValue = 5f / 3f; // 7
        double myDoubleValue = 5d / 3d; //16
        System.out.println("Int =" + myIntValue);
        System.out.println("Float =" + myFloatValue);
        System.out.println("Double =" + myDoubleValue);

        int pounds = 131;
        double convertKg = pounds * 0.45359237d;
        System.out.println("Converted KG =" + convertKg);
    }

}
