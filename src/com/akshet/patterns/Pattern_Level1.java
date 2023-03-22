package com.akshet.patterns;

import java.util.Scanner;

public class Pattern_Level1 {

    public static void pattern_1(int rows){
        System.out.println("Pattern 1");
        for(int row=0;row<rows;row++){
            for(int col=0;col<=row;col++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern_2(int rows){
        System.out.println("Pattern 2");
        for(int row=0;row<rows;row++){
            for(int col=0;col<rows-row;col++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern_3(int rows){
        System.out.println("Pattern 3");
        for(int row=0;row<rows;row++){
            for(int col=0;col<=row;col++){
                System.out.print((col+1)+" ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern_4(int rows){
        System.out.print("Pattern 4");

       /* One way
       for(int row=0;row<rows;row++){
            for(int col=0;col<=row;col++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(int row=0;row<rows;row++){
            for(int col=0;col<=rows-row-2;col++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }*/

        //Other way
        /*for(int row =0;row<2*rows;row++){
            if(row<rows){
                for(int col=0;col<=row;col++){
                    System.out.print("* ");
                }
            }else {
                for(int col=0;col<=(2*rows)-row-2;col++){
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }*/
        // one more way
        for(int row =0;row<2*rows;row++) {
            int col= row>rows?(2*rows)-row:row;
            for(int cols=0;cols<col;cols++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern_5(int rows){
        System.out.println("Pattern 5");
        for(int row=0;row<rows;row++){
           /* for(int col=0;col<=rows-row+1;col++){
                System.out.print(" ");
            }
            for(int col=0;col<=row;col++){
                System.out.print("*");
            }*/
            //OR
            for(int col=0;col<rows;col++){
                if(col<rows-row-1)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void pattern_6(int rows){
        System.out.println("Pattern 6");
        for(int row=0;row<rows;row++){
            for(int col=0;col<rows;col++){
                if(col<row)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void pattern_7(int rows){
        System.out.println("Pattern 7");
        for(int row=1;row<=rows;row++){
            for(int col=0;col<rows-row;col++){
                System.out.print(" ");
            }
            for(int col1=0;col1<2*row-1;col1++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void pattern_8(int rows){
        System.out.println("Pattern 8");
        for(int row=1;row<=rows;row++){
            for(int col=0;col<row;col++){
                System.out.print(" ");
            }
            for(int col1=row;col1<=2*rows-row;col1++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void pattern_9(int rows){
        System.out.println("Pattern 9");
        for(int row=1;row<=rows;row++){
            for(int col=0;col<rows-row;col++){
                System.out.print(" ");
            }
            for(int col1=0;col1<row;col1++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern_10(int rows){
        System.out.println("Pattern 10");
        for(int row=1;row<=rows;row++){
            for(int col=0;col<row-1;col++){
                System.out.print(" ");
            }
            for(int col1=0;col1<=rows-row;col1++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern_11(int rows){
        System.out.println("Pattern 11");
        for(int row=1;row<=2*rows;row++) {
            if (row <= rows) {
                for (int col = 0; col < row - 1; col++) {
                    System.out.print(" ");
                }
                for (int col1 = 0; col1 <= rows - row; col1++) {
                    System.out.print("* ");
                }
            } else {
                int row1 =row-rows;
                for (int col = 0; col <rows - row1; col++) {
                    System.out.print(" ");
                }
                for (int col1 = 0; col1 < row1; col1++) {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void pattern_12(int rows){
        System.out.println("Pattern 12");
        for(int row=1;row<=2*rows-1;row++) {
            if(row<=rows){
                for(int col=0;col<rows-row;col++){
                    System.out.print(" ");
                }
                for(int col=0;col<row;col++){
                    System.out.print("* ");
                }
            }else{
                for(int col=rows;col<row;col++){
                    System.out.print(" ");
                }
                for(int col=0;col<(2*rows)-row;col++){
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void pattern_13(int rows){
        System.out.println("Pattern 13");
        for(int row=1;row<rows;row++) {
                for(int col=0;col<rows-row;col++){
                    System.out.print(" ");
                }
                if(row==1) {
                    System.out.print("*");
                }else {
                    System.out.print("*");
                    for (int col = 0; col < (2*row)-3; col++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            System.out.print("\n");
        }
        for(int last =1;last<=(2*rows)-1;last++){
            System.out.print("*");
        }
    }

    public static void pattern_14(int rows){
        System.out.println("\nPattern 14");
        for(int last =1;last<=(2*rows)-1;last++){
            System.out.print("*");
        }
        System.out.print("\n");
        for(int row=1;row<rows;row++) {
            for(int col=0;col<row;col++){
                System.out.print(" ");
            }
            if(row==rows-1) {
                System.out.print("*");
            }else {
                System.out.print("*");
                for (int col = 0; col <2*(rows-row)-3; col++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

    public static void pattern_15(int rows){
        System.out.println("Pattern 15");
    }

    public static void main(String[] args) {

        System.out.println("Enter the number of rows you want to print the pattern! ");
        Scanner scan = new Scanner(System.in);
        int rows= scan.nextInt();

     /*     *
            **
            ***
            ****
            *****
     */
        pattern_1(rows);
      /*    *****
            ****
            ***
            **
            *
     */
        pattern_2(rows);
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
     */
        pattern_3(rows);
        /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *
     */
        pattern_4(rows);
    /*   *
        **
       ***
      ****
     *****
     */
        pattern_5(rows);
    /*
     *****
      ****
       ***
        **
         *
    */
        pattern_6(rows);

        /*
          *
         ***
        *****
       *******
      *********
        */
        pattern_7(rows);

    /*
     *********
      *******
       *****
        ***
         *
    */
        pattern_8(rows);

    /*
         *
        * *
       * * *
      * * * *
     * * * * *
    */
        pattern_9(rows);

    /*
      * * * * *
       * * * *
        * * *
         * *
          *
     */
        pattern_10(rows);

    /*
     * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *
    */
        pattern_11(rows);
    /*
          *
         * *
        * * *
       * * * *
      * * * * *
       * * * *
        * * *
         * *
          *
    */
       pattern_12(rows);
    /*   *
        * *
       *   *
      *     *
     *********
    */
        pattern_13(rows);
    /*
     *********
      *     *
       *   *
        * *
         *
    */
        pattern_14(rows);
    /*
            *
           * *
          *   *
         *     *
        *       *
         *     *
          *   *
           * *
            *
    */
        pattern_15(rows);

    }

}
