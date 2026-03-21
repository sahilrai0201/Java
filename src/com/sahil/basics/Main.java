package com.sahil.basics;
import java.util.*;

public class Main{

    public static void main(String[] args){

        //write your code ->
        System.out.println("Hello Java");
//        System.out.print("Hello Java");

        //variables ->
//        String mame = "Sahil";
//        int age = 30;
//        String neighbour = "Pappu";
//        String friend = neighbour;

        //Data types ->
        //Primitive ->
//        byte age = 30;
//        //int phone = 12345678900;   //gives error b/c of out of range number (-2^31 to 2^31-1)
//        long phone1 = 12345678900L;   //range of long is (-2^63 to 2^63-1)
//        float pi = 3.14f;
//        char letter = '@';      //takes 2 bytes
//        boolean isAdult = true;   //stores true and false

        //Non-primitive ->
//        String name = "Sahil";      //string is non-primitive data type, it has their own functions
//        System.out.println(name.length());   //finds length



        //Strings ->
        //concatenate
//        String name1 = "Sahil";
//        String name2 = "Rai";
//        String name3 = name1 + " and " + name2;
//        System.out.println(name3);

        //charAt
//        String name1 = "Sahil";
//        System.out.println(name1.charAt(0));

        //length
//        String name1 = "Sahil";
//        System.out.println(name1.length());

        //replace
//        String name1 = "Sahil";
//        String name2 = name1.replace('a', 'b');
//        System.out.println(name2);    //prints Sbhil
//                 //changes do not occur in original string, we just get the new string with new changes
//        System.out.println(name1);    //prints Sahil

        //substring
//        String name1 = "Sahil and Rai";
//        System.out.println(name1.substring(0, 5));  //0 is included but 5 is not included which prints 'Sahil'



        //Arrays ->
        //declaration
//        int[] marks = new int[3];
//        marks[0] = 97;
//        marks[1] = 96;
//        marks[2] = 95;
//        System.out.println(marks[2]);

        //no initialization
//        int[] marks = new int[3];
//        System.out.println(marks[1]);   //prints 0 instead of some garbage value like in cpp

        //length
//        System.out.println(marks.length);

        //sort
//        System.out.println(marks[0]);
//        Arrays.sort(marks);
//        System.out.println(marks[0]);

        //1D array
//        int[] marks = {97, 98, 95};

        //2D array
//        int[][] finalMarks = {{97, 98, 95}, {95, 95, 98}};
//        System.out.println(finalMarks[0][1]);

        //Casting
        //implicit
//        double price = 100.00;
//        double finalPrice = price + 18;
//        System.out.println(finalPrice);

        //explicit
//        int p = 100;
//        int fP = p + (int)18.99;
//        System.out.println(fP);

        //constants
//        final float PI = 3.14F;


    }
}