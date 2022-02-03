package basicprgm;
import java.util.Scanner;
public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.println("The fibonacci series of given number is : ");
        System.out.print(num1 + " " + num2);
        for (int i = 2;i<=num;i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(" " + num3);
        }

    }
}

