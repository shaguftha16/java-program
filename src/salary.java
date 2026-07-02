import java.util.Scanner;
public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr your salary");
        int salary =sc . nextInt();
        if (salary >=50000){
            System.out.println("20%bouns");
        }
        else if (salary >= 30000){
            System.out.println("10% bouns");
        }
        else if(salary < 30000){
            System.out.println("no bouns");
        }

    }
}

