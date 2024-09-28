package com.nikhil;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};

        for (int i = 0;i<array.length;i++){
            for (int j =0;j<array[i].length;j++){
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        for(int[] element:array){
            for(int digit:element){
                System.out.print(digit);

            }
            System.out.print("\n");
        }

        System.out.println(Arrays.deepToString(array));
        for (int i = 0;i<array.length;i++){
            for (int j =0;j<array[i].length;j++){
                array[i][j] = (i*10)+(j+1);
            }
            System.out.print("\n");
        }
        for (int i = 0;i<array.length;i++){
            for (int j =0;j<array[i].length;j++){
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        }

    }
