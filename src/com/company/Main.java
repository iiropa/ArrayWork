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
        int[] numbers = {2, 5, -3, 11, 193, -2};
        for (int v : numbers) System.out.println(v);




}


}