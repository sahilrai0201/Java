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

        //operators
//        int a = 3;
//        int b = 2;
//        int sum = a + b;
//        System.out.println(sum);

        //Math class
//        System.out.println(Math.max(5, 6));
//        System.out.println(Math.min(5, 6));
//
//        System.out.println(Math.random());
//        System.out.println((int)Math.random());
//        System.out.println((int)(Math.random()*100));

        //taking inputs
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input your age : ");
//        int age = sc.nextInt();
//        System.out.println(age);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input your name : ");
//        String name = sc.next();
//        String name = sc.nextLine();
//        System.out.println(name);

        //comparison operators
        //a == b
        //a != b
        //a < b
        //a > b
        //a <= b
        //a >= b


        //conditional statements
//        boolean isSunUp = true;
//        if(isSunUp == true){
//            System.out.println("day");
//        }
//        else{
//            System.out.println("night");
//        }

        //logical operators
        //logical and -> &&
        //logical OR -> ||

        //conditional statements
//        Scanner sc = new Scanner(System.in);
//        //pen = 10, notebook = 40
//        int cash = sc.nextInt();
//        if(cash < 10){
//            System.out.println("cannot buy anything");
//            System.out.println("get more cash");
//        }
//        else if(cash > 10 && cash < 50){
//            System.out.println("can get one thing only");
//        }
//        else{
//            System.out.println("can get both");
//        }

        //conditional statements (switch)
//        int day = 3;     //1-monday, 2-tuesday, 3-wednesday....
//        switch(day){
//            case 1 :
//                System.out.println("monday");
//                break;
//            case 2 :
//                System.out.println("tuesday");
//                break;
//            case 3 :
//                System.out.println("wednesday");
//                break;
//            default:
//                System.out.println("thu - sun");
//        }

    }
}