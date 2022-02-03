package basicprgm;
import java.util.Scanner;
public class FactroialNumber {

    public static void main(String[] args) {

        int num, fact = 1;
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        while (num >= 1) {
            fact = fact * num;
            num--;
        }
        System.out.println("The factorial of the given number is : " + fact);

    }

}
