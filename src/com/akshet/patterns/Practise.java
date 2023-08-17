package com.akshet.patterns;

import java.util.Scanner;

public class Practise {

    public static void pattern1(int n){
        System.out.println("pattern1");
        for( int row = 1; row <=n ; row++){

            for(int col = 1 ;col<=row;col++){
                //int num = (col+row)%2==0?1:0;
                System.out.print(col);
            }for(int col= 1; col<=2*(n-row);col++){
                System.out.print(" ");
            }for(int col= 1; col<=row;col++){
                System.out.print(row-col+1);
            }
            System.out.println();
        }
//        for( int row = 0; row<n ;row++) {
//            for (int col = 0; col < n - row - 1; col++) {
//                System.out.print(" ");
//            }
//            for (int col = 0; col < 2 * (row + 1) - 1; col++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for( int row = 0; row<n ;row++) {
//            for(int col = 0; col<row;col++){
//                System.out.print(" ");
//            }
//            for(int col = 0; col<(2*(n-row) - 1);col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }


    public static void pattern2(int n) {
        System.out.println("pattern2");
        for(int row =1;row<=2*n;row++) {
            int start = row<=n?n-row+1:row-n;
            int space = row<=n?2*(row-1):2*(2*n-row);
            for (int col = 1; col <= start; col++) {
                System.out.print("*");
            }
            for (int col = 1; col <= space; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= start; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        System.out.println("pattern3");
        for(int row = 1; row <= 2*n-1; row++){
            for(int col =1 ;col<=2*n-1;col++) {
                int left = col-1;
                int right = 2*n - col - 1 ;
                int up = row-1;
                int down = 2*n - row -1;

                int min_vertical = Math.min(up,down);
                int min_horizontal = Math.min(left,right);
                int min = Math.min(min_vertical,min_horizontal);
                System.out.print(n-min+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        System.out.println("Enter the number of Rows you want to print: ");
        Scanner scan = new Scanner(System.in);

        int row = scan.nextInt();

        /*
        1      1
        12    21
        123  321
        12344321
        */
        pattern1(row);
        /*
         **********
         ****  ****
         ***    ***
         **      **
         *        *
         *        *
         **      **
         ***    ***
         ****  ****
         **********
        */
        pattern2(row);

        /*
        4 4 4 4 4 4 4
        4 3 3 3 3 3 4
        4 3 2 2 2 3 4
        4 3 2 1 2 3 4
        4 3 2 2 2 3 4
        4 3 3 3 3 3 4
        4 4 4 4 4 4 4
        */
        pattern3(row);
    }
}
