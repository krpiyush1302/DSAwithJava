import java.util.Scanner;
public class Leapyr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the year:");
        int year = in.nextInt();

        if(year%4==0 || year%100==0 || year%400==0)
        {
            System.out.println("The year is a leap year:" +year);
        }
        else {
            System.out.println("The year is not a leap year:" +year);
        }
    }
}
