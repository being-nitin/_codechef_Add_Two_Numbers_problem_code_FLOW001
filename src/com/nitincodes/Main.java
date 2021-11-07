package com.nitincodes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* Shivam is the youngest programmer in the world, he is just 12 years old,
	   Shivam is learning programming and today he is writing his first program.

       The task is very simple: given two integers A and B, write a program to add these two numbers
       and output it.
        */

        /* Input
        This section tells you the format in which your program should receive the input.
        The first line contains an integer T, the total number of test cases.
         Then follow T lines, each line contains two Integers A and B.
	 */
        /*Output
          This section tells us the format in which your program should give the output
          For each test case, add A and B and display the sum in a new line.
             */
    Scanner sc = new Scanner(System.in);
    int a,b,t,z;
    // t = no of test cases that means how much times we will be adding the two numbers;
        t = sc.nextInt();
        for(int i=0;i<t;i++){
            a = sc.nextInt();
            b = sc.nextInt();
            z = a+b;
            System.out.println(z);
        }
    }
}
