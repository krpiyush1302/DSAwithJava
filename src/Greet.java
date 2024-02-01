//Ques - Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name:");
        String name = in.next();
        System.out.println("Hye "+name+" ,Nice to see you again.");;
    }
}
