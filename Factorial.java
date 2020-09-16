/*
Created by Intellij IDEA
    User:hp (AditiMishra149)
    Date:16-09-2020
    Time:09:58 PM
*/

import java.util.Scanner;

public class Factorial {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n,i,c=1;
        System.out.println("Enter any Number");
        n=sc.nextInt();
        for(i=n;i>0;i--)
        {
            c=i*c;
        }
        System.out.println("factorial is"+c);
    }

}
