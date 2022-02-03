package basicprgm;

public class Rescursion {
    public int factorial(int x) {

        if (x==1) {
            return x;
        }else {
            return x * factorial(x-1);
        }
    }

    public static void main(String[] args) {

        int x = 5;
        Rescursion obj = new Rescursion();
        System.out.println(obj.factorial(x));

    }

}

