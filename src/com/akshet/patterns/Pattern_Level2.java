package com.akshet.patterns;

import java.util.Arrays;
import java.util.Scanner;

public class Pattern_Level2 {

    //If we want the element of the previous row then we have to use 2D Array
    public static void pattern_1(int rows) {
        System.out.println("pattern 1");
        // Here the size of row and col is rows+1 as we are  running the loops from 1 till rows.
        int[][] AuxArr = new int[rows + 1][rows + 1];

        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= rows - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row)
                    AuxArr[row][col] = 1;
                else
                    AuxArr[row][col] = AuxArr[row - 1][col - 1] + AuxArr[row - 1][col];
                System.out.print(AuxArr[row][col] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern_2(int rows) {
        System.out.println("pattern 2");
        for (int row = 1; row <= (2 * rows) - 1; row++) {
            int spaces = row > rows ? (row - rows) : (rows - row);
            for (int col = 1; col <= spaces; col++) {
                System.out.print(" ");
            }
            int noCol = rows - spaces;
            for (int col = 1; col <= noCol; col++) {
                if (row > rows)
                    System.out.print(noCol - col + 1);
                else
                    System.out.print(row - col + 1);
            }
            for (int col = 1; col <= noCol - 1; col++) {
                if (row > rows)
                    System.out.print(col + 1);
                else
                    System.out.print(col + 1);
            }
            System.out.print("\n");
        }
    }

    public static void pattern_3(int rows){
        System.out.println("pattern 3");
        int num=1;
        for(int row=1;row<=rows;row++){
            for(int col=1;col<=row;col++){
                System.out.print(num++ +" ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern_4(int rows){
        System.out.println("pattern 4");
        for(int row=1;row<=rows;row++){
            for(int col=1;col<=row;col++){
                if((row+col)%2==0)
                    System.out.print(1+" ");
                else
                    System.out.print(0+" ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern_5(int rows){
        System.out.println("pattern 5");
        for(int row=1;row<=rows;row++){
            for(int col=1;col<=rows-row+1;col++){
                    System.out.print(row+" ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern_6(int rows){
        System.out.println("pattern 6");
        int index=1;
        for(int row=1;row<=rows;row++){
            for(int col=1;col<=row-1;col++){
                System.out.print("  ");
            }
            int nocolCheck=rows-row+2;
            for(int col=1;col<=((2*rows)+3)-(2*row);col++){
                if(col==nocolCheck)
                    System.out.print(" ");
                else if(col<nocolCheck) {
                    System.out.print((index++) + " ");
                }
                else {
                    int max= (rows*(rows+1))-rows+1;
                    System.out.print(max-index+row+col-2 + " ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void pattern_7(int rows){
        System.out.println("pattern 7");
        for(int row=1;row<=rows;row++){
            for(int col=1;col<=rows-row;col++){
                System.out.print("  ");
            }
            for(int col=1;col<=row;col++)
                System.out.print((row-col+1)+ " ");
            for(int col=1;col<=row-1;col++)
                System.out.print(col+1+ " ");
            System.out.print("\n");
        }
    }

    public static void pattern_8(int rows){
        System.out.println("pattern 8");
    /* This is the traditional way of doing
        for(int row=1;row<=((2*rows)-1);row++) {
            int nocol=row>rows?2*rows-row:row;
                for (int col = 1; col <= nocol; col++)
                        System.out.print((rows-col+1) + " ");
                for( int col =1 ; col<=rows-row;col++)
                    System.out.print(rows-row+1+" ");
                for( int col =1 ; col<=rows-row;col++)
                    System.out.print(rows-row+1+" ");
                for (int col = 1; col <= nocol-1; col++)
                    if(row<=rows)
                        System.out.print(rows-row+col+1+ " ");
                if(row>rows) {
                    for (int col = 1; col <= row-rows ; col++)
                        System.out.print(row - rows + 1 + " ");
                    for (int col = 1; col <= row-rows ; col++)
                        System.out.print(row - rows + 1 + " ");
                    for(int col=1;col<=2*rows-row-1;col++)
                        System.out.print(row-rows+col+1+ " ");
                }
            System.out.print("\n");
            }
    */
        // there is one more way of doing it Where we will be focusing mainly on the index position and try
        //to find the pattern that the index is following
        int right=0;
        int left=0;
        int up=0;
        int down=0;
        for(int row=1;row<=((2*rows)-1);row++) {
                for(int col=1;col<=(2*rows)-1;col++){
                    right=2*rows-col-1;
                    left=col-1;
                    up=row-1;
                    down=2*rows-row-1;
                    int index_1=Math.min(right,left);
                    int index_2=Math.min(up,down);
                    int index=Math.min(index_1,index_2);
                    System.out.print((rows-index)+ " ");
                }
            System.out.print("\n");
        }
    }

    public static void pattern_9(int rows){
        System.out.println("pattern 9");
        int index=1;
        for(int row=1;row<=rows;row++){
            for(int col=1;col<=row;col++){
                char c=index%2==0?'A':'a';
                System.out.print((char) (c+(index++)-1)+ " ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern_10(int rows){
        System.out.println("pattern 10");
        for(int row=1;row<=rows;row++){
            for(int col=1;col<=rows-row+1;col++){
                char c= (char) ('A'+rows);
                System.out.print((char) (c-col-row+1)+ " ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern_11(int rows){
        System.out.println("pattern 11");
        for(int row=1;row<=rows;row++){
            for(int col=1;col<=row;col++){
                char c= (char) ('A'+rows);
                System.out.print((char) (c+(col)-row-1)+ " ");
            }
            System.out.print("\n");
        }
    }

    public static void pattern_12(int rows){
        System.out.println("pattern 12");
        for(int row=1;row<=rows;row++){
            for(int col=1;col<=row;col++)
                System.out.print(col);
            for(int col=1;col<=2*(rows-row);col++)
                System.out.print(" ");
            for(int col=1;col<=row;col++)
                System.out.print(row-col+1);
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows you want to print the pattern! ");
        Scanner scan = new Scanner(System.in);
        int rows= scan.nextInt();

    /*
              1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1
    */
        //Pascals Triangle
        pattern_1(rows);

    /*
         1
        212
       32123
      4321234
       32123
        212
         1
    */
        pattern_2(rows);

    /*
       1
       2  3
       4  5  6
       7  8  9  10
       11 12 13 14 15
    */
        pattern_3(rows);

    /*
       1
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1
    */
        pattern_4(rows);
    /*
      1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6
    */
        pattern_5(rows);
    /*
    1 2 3 4  17 18 19 20
        5 6 7  14 15 16
          8 9  12 13
            10 11
    */
        pattern_6(rows);
    /*
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
    */
        pattern_7(rows);
    /*
        4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4
    */
        pattern_8(rows);
    /*
       a
       B c
       D e F
       g H i J
       k L m N o
    */
        pattern_9(rows);
    /*
       E D C B A
       D C B A
       C B A
       B A
       A
    */
        pattern_10(rows);
    /*
       E
       D E
       C D E
       B C D E
       A B C D E
    */
        pattern_11(rows);

    /*
       1      1
       12    21
       123  321
       12344321
    */
        pattern_12(rows);
    }

}
