//Ques - Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;
public class Checkno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num = in.nextInt();

        if(num%2==0)
        {
            System.out.println("The given number is an Even no:" +num);
        }
        else
        {
            System.out.println("The given number is an Odd number:" +num);
        }
    }
}
