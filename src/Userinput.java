import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {
        System.out.println("taking user input");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number");
       // int a = sc.nextInt();
       float a = sc.nextFloat();
        System.out.println("enter the 2nd number");
       // int b = sc.nextInt();
       float b =sc.nextFloat();
         float multi = a * b ;
        System.out.println("the multiplication of both number is" + multi);
    }
}