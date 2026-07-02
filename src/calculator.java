import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the 2nd number");
        int num2 = sc.nextInt();
        System.out.println("enter your operater (+,-,*,/,):");
        char operator=sc.next().charAt(0);
        switch (operator){
            case '+':
                 int sum= num1 + num2;
                System.out.println(sum);
                break;
            case '-':
                int difference= num1 - num2;
                System.out.println(difference);
                break;
            case '*':
                int multi = num1 * num2;
                System.out.println(multi);
                break;
            case '/':
                int div= num1 / num2;
                System.out.println(div);
                break;
            default:
                System.out.println("invalid operator");

        }
             sc.close();

    }
}

