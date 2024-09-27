package com.nikhil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] secondArray = randomArray(10);
        System.out.println(Arrays.toString(secondArray));
        Arrays.sort(secondArray);
        System.out.println(Arrays.toString(secondArray));
        int[] thirdArray = new int[15];
        Arrays. fill(thirdArray,69);
        System.out.println(Arrays.toString(thirdArray));
        int[] fourthArray =Arrays.copyOf(thirdArray,12);
        System.out.println(Arrays.toString(fourthArray));
        System.out.println("=".repeat(100));

        char[] searchArray = {'e','f','d','g','a','i','b','h','c','j'};
        Arrays.sort(searchArray);
        System.out.println(Arrays.binarySearch(searchArray,'m'));

        System.out.println(Arrays.toString(searchArray));

        char[] compareArray = {'a','b','c','d','e','f','g','h','i','j'};
        System.out.println(Arrays.equals(searchArray,compareArray));


    }
     public static int[] randomArray(int length){
         Random random = new Random();
         int[] randomArray = new int[length];
         for(int i = 0; i<length;i++){
             randomArray[i] = random.nextInt(25,350);
         }
         return randomArray;
     }
}
