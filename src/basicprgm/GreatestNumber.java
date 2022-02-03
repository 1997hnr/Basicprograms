package basicprgm;
import java.util.Scanner;
public class GreatestNumber {
    public static void main(String[] args) {

        int num, max;
        System.out.println("Enter the number of elements in an array : ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        int x[] = new int[num];
        System.out.println("Enter the elements in an array : ");
        for (int i = 0; i < num; i++) {
            x[i] = input.nextInt();
        }
        max = x[0];
        for (int i = 0; i < num; i++) {
            if (max < x[i]) {
                max = x[i];
            }
        }
        System.out.println("The largest number from the given array is : " + max);
    }
}
