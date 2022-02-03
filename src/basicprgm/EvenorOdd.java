package basicprgm;
import java.util.Scanner;
public class EvenorOdd {




        public static void main(String[] args) {

            System.out.println("Enter the number to check : ");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            if (num % 2 == 0) {
                System.out.println("The given number is even.");
            } else {
                System.out.println("The given number is odd.");
            }

        }

    }

