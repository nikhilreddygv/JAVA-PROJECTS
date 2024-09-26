package com.nikhil;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myIntArray = {6,5,4,3,2,1};
//        System.out.println(myIntArray[1]);
        for(int i =0;i<6;i++) {
            System.out.println(myIntArray[i]);
        }

            for (int variable:myIntArray){
                System.out.println(variable);
            }
            String newvar = Arrays.toString(myIntArray);
            System.out.println(newvar);

            Object[] objectarray = new Object[3];
            objectarray[0] = "nikhil";
            objectarray[1] = new StringBuilder("hema");
            objectarray[2] = new int[]{44,55,66};

            System.out.println(Arrays.toString(objectarray));

    }
}
