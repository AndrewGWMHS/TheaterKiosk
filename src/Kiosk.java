import java.util.Scanner;
public class Kiosk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        if (scan.hasNextInt()) {
            age = scan.nextInt();
            if (age >= 0 && age <= 122) {
                if (age >= 21) {
                    System.out.println("You get a wristband.");
                }
                else {
                    System.out.println("You dont get a wristband.");
                    System.exit(0);
                }

            }
            else
            {
                System.out.println("Invalid Age Input");
            }
        }
        else
        {
            System.out.println("Invalid Data Type.");
            System.exit(0);
        }
    }
}