package com.company;

public class Main {


    public static void main(String[] args) {

       //Ex. 1
        /*
         double[] values = {5.4, -1.4, 16, -5, 2.2};
          double smallest = values [0];

              for (double v : values)
                if (v < smallest)
                  smallest = v;

        System.out.println("smallest is: " + smallest);

*/
        //Ex.2

/*
        int[] numbers = {5, 4, 6, 2, 7};
        int[] diffs = new int [numbers.length - 1];
        for (int i = 0; i < diffs.length; i++)
            diffs [i] = numbers [i+1] - numbers [i];

        for (int d : diffs)
            System.out.print ( d + " ");
    */
    //Ex. 3
    /*
        int[] numbers = {5, 4, 6, 2, 7};
        int[] diffs = new int [numbers.length - 1];
        for (int i = 0; i < diffs.length; i++)
            diffs [i] = numbers [i+1] - numbers [i];

        boolean arithmetic = true;
        for (int i = 1; i < diffs.length; i++)
            if (diffs [i] != diffs [i-1])
                arithmetic = false;
        System.out.println("is it arithmetic: " + arithmetic);

      */
        //HW. 1
       /*

        int[] numbers = {2, 5, -3, 11, 193, -2};
        int sum = 0;
        for (int i : numbers)
            sum += i;
        System.out.print("The elements are: ");
        for (int v : numbers)
            System.out.print(v + ", ");
        System.out.println("\n"); // funny space
        System.out.println("the sum is " + sum);

        */
        // HW. 3
/*

        // purpose of algorithm is to check if numbers are in incrementing progression
        int[] values = {-3, 2, 5, 4, 7};
        boolean result = true;

        for (int n = 1; n < 5; n++){
            if (values[n] < values[n - 1]) {
                result = false;
            }
        }
        System.out.println(result);

*/
        //Hw. 4
        /*

        int[] values = {5, 4, -7, -2, -1};
        int[] newValues = {0, 0, 0, 0, 0}; //epic new array with null values

        for (int i = 0; i < 5; i++){
            newValues[i] = values[4-i]; //4-i = 4-0 = 4, 4-i=4-1=3, just switches positions of numbers in array
        }
*/





}


}