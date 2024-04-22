import java.util.Scanner;
public class quest6_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();

        System.out.print("Enter value for d: ");
        double d = scanner.nextDouble();

        System.out.print("Enter value for m: ");
        double m = scanner.nextDouble();

        System.out.print("Enter value for n: ");
        double n = scanner.nextDouble();

        double denominator = a * d - c * d;

        if (denominator == 0) {
            System.out.println("The system of linear equations has no solution.");
        } else {
            double x1 = (m * d - b * n) / denominator;
            double x2 = (n * a - m * c) / denominator;

            System.out.printf("The solution is x1 = %.2f, x2 = %.2f%n", x1, x2);
        }
    }

}