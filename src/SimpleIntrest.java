//Ques - Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal:");
        int p = in.nextInt();
        System.out.print("Enter the time in years:");
        int t = in.nextInt();
        System.out.print("Enter the rate in %:");
        int r = in.nextInt();

        int SI = (p*r*t)/100;

        System.out.println("Simpleintrest :" +SI);

    }
}
