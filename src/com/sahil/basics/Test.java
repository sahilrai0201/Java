//FUNCTIONS & METHODS

package com.sahil.basics;
public class Test {

    public static void printJava(){
        System.out.println("Hello java");
    }

    public static void printName(String name){
        System.out.println(name);
    }

    public static void printSum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args){
        //Methods
        printJava();
        printName("Sahil");
        printSum(5, 6);
    }
}
