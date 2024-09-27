package com.nikhil;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] intarray = readIntegers();
//        if(intarray instanceof int[]){
//            System.out.println("this is an int array");
//        }
        Arrays.sort(intarray);
        System.out.println("the minimum element in the array is: "+intarray[0]);
    }

    public static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a comma delimited list of numbers in this format: a,b,c,d...");
        String listOfNumbers = scanner.nextLine();
        String[] stringArray = listOfNumbers.split(",");
        int[] integerArray = new int[stringArray.length];
        for(int i = 0;i< stringArray.length;i++){
            integerArray[i] = Integer.parseInt(stringArray[i]);
        }
//        Arrays.sort(integerArray);
        return integerArray;

    }


}
