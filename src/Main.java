import java.util.Scanner;
import java.util.InputMismatchException;

class Padlik {

    public static double MyResult (int k, double x) {
        double pogr = Math.pow(10, -k);
        double sum = 1, p = 1;
        int n = 1;
        while (Math.abs(p) > pogr) {
            p = p * ((n + 2) * (-1)) * x / n;
            sum = sum + p;
            n++;
        }
        return sum;
    }

    public static double Result (double x) {
        double result = 1/(1+x)/(1+x)/(1+x);
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Enter k: ");
            int k = in.nextInt();
            System.out.print("Enter x, с запятой: ");
            double x = in.nextDouble();

            double myResult = Padlik.MyResult(k, x);
            double result = Padlik.Result(x);

            System.out.printf("My Result: %." + k + "f \n", myResult);
            System.out.printf("Result: %." + k + "f \n", result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numeric values correctly.");
        } finally {
            in.close();
        }
    }
}