package basicprgm;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("Enter the number to check : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int flag = 0;
        if (num == 0 || num == 1) {
            System.out.println("The given number is not Prime number.");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    System.out.println("The given number is not Prime number.");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("The given number is Prime number.");
            }
        }
    }
}
