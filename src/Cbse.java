import java.util.Scanner;

public class Cbse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of 5 subjects (out of 100):");

        System.out.print("English: ");
        float english = sc.nextFloat();

        System.out.print("Mathematics: ");
        float maths = sc.nextFloat();

        System.out.print("Science: ");
        float science = sc.nextFloat();

        System.out.print("Social Science: ");
        float social = sc.nextFloat();

        System.out.print("Computer: ");
        float computer = sc.nextFloat();

        float total = english + maths + science + social + computer;
        float percentage = (total / 500) * 100;

        System.out.println("\nTotal Marks = " + total + "/500");
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}
