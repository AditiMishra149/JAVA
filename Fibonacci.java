/*
Created by Intellij IDEA
    User:hp (AditiMishra149)
    Date:16-09-2020
    Time:10:43 PM
*/

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int i,n,p1=0, p2=1, p0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the maximum range of fibonacci series");
        n=sc.nextInt();
        System.out.print(" "+p1);
        System.out.print(" "+p2);
        for(i=0;p0<=n;i++)
        {
            p0=p1+p2;
            System.out.print(" "+p0);
             p1=p2;
             p2=p0;
        }
    }
}
