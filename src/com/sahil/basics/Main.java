package com.sahil.basics;

public class Main{

    public static void main(String[] args){

        //write your code ->
        System.out.println("Hello Java");

        //variables ->
//        String mame = "Sahil";
//        int age = 30;
//        String neighbour = "Pappu";
//        String friend = neighbour;

        //Data types ->
        byte age = 30;
        //int phone = 12345678900;   //gives error b/c of out of range number (-2^31 to 2^31-1)
        long phone1 = 12345678900L;   //range of long is (-2^63 to 2^63-1)
        float pi = 3.14f;
        char letter = '@';      //takes 2 bytes
        boolean isAdult = true;   //stores true and false
    }
}