import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {
        System.out.println("taking user input");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number");
        int a = sc.nextInt();
        System.out.println("enter the 2nd number");
        int b = sc.nextInt();
         int multi = a * b ;
        System.out.println("the multiplication of both number is" + multi);
    }
}