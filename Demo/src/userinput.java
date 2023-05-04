import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);    // scanner object

        System.out.println("Enter Admin No.");
        int AdminNo = input.nextInt();
        
        System.out.println("Enter Name:");
        String name = input.next();

        System.out.println("Enter Class:");
        int grade = input.nextInt();
    }
}
