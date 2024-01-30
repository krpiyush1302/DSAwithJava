import java.util.Scanner;

public class Input {
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter input:");
        String name = input.next();
        System.out.println("Your name is:" + name);
    }
}