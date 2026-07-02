import java.util.Scanner;
public class drivinglicence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your age for driving: ");
        int drivingAge = sc.nextInt();

        if (drivingAge >= 18) {
            System.out.print("Do you have a driving license? (true/false): ");
            boolean license = sc.nextBoolean();

            if (license) {
                System.out.println("You can drive.");
            } else {
                System.out.println("You need a driving license.");
            }
        } else {
            System.out.println("You are not eligible to drive.");
        }

        }
    }

