//  Ques - Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;
public class Ques {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum=0;
        char ch;
        do{
            System.out.print("Enter the number :");
            int num = in.nextInt();
            sum=sum+num;
            System.out.print("Enter x to End :\n");
            System.out.print("Enter another to continue :");

            ch = in.next().trim().charAt(0);
        }while( ch!='x' );
        {
            System.out.println(sum);
        }

    }
}
