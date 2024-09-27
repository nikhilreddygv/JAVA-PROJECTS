package com.nikhil;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int[] generateRandomArray(int lengthofarray){
        Random random =new Random();
        int[] randomArray = new int[lengthofarray];
        for(int i=0; i<lengthofarray;i++){
            randomArray[i]=random.nextInt(11,100);
        }
        Arrays.sort(randomArray);
        return randomArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of the array you want");
        int length = scanner.nextInt();
        int[] reverseArray = generateRandomArray(length);
        System.out.println("the array that you generated is");
        System.out.println(Arrays.toString(reverseArray));
        for (int i =0; i<length/2;i++){
            int temp = reverseArray[i];
            reverseArray[i]=reverseArray[length-i-1];
            reverseArray[length-i-1]=temp;
        }
        System.out.println("The above array in descending order is = "+ Arrays.toString(reverseArray));
    }
}
