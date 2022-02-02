import java.util.Scanner;

public class Inputsc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int res = a / b;
                if (a < 0 || b < 0)
                    throw new NegativeArgumentException();
                System.out.println(res);

            } catch (NegativeArgumentException e) {
                System.out.println("Negative Argument");

            }
        }
    }

    private static class NegativeArgumentException extends Throwable {
    }
}