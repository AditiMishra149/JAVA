/*
Created by Intellij IDEA
    User:hp (AditiMishra149)
    Date:15-09-2020
    Time:10:44 PM
*/
import java.util.Scanner;
public class MathAddSubMulDiv {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a,b,c,s;
        System.out.println("enter the first no.");
        a=sc.nextInt();
        System.out.println("enter the second number");
        b= sc.nextInt();
        System.out.println("which operation you want to perform");
        System.out.println("press 1 for addition");
        System.out.println("press 2 for subtraction");
        System.out.println("press 3 for multiplication");
        System.out.println("press 4 for division");
        s= sc.nextInt();
        switch(s)
        {
            case 1:
                c=a+b;
                System.out.println("Addition of two no. is"+c);
                break;
            case 2:
                c=a-b;
                System.out.println("Subtraction of two no. is"+c);
                break;
            case 3:
                c=a*b;
                System.out.println("multiplication of two no. is"+c);
                break;
            case 4:
                 c=a/b;
                System.out.println("division of two no. is"+c);
                break;
            default:
                System.out.println("Invalid Input");
                break;

        }
    }

}
