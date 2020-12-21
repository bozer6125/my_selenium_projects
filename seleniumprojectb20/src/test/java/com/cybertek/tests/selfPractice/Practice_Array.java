package com.cybertek.tests.selfPractice;


import java.util.Arrays;

public class Practice_Array {
    //int[] arr1 = {1, 2, 3, 4, 5};
    // array, please get the following results;
    // output1: 1 2 3 4 5 and
    // output2: [1, 2, 3, 4, 5] by writing your code sequence
    // and then compare them with one another
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        for(int each: arr1){
            System.out.print(each+" ");
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(arr1));
    }
}

