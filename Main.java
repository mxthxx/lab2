import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = sc.nextDouble();
        System.out.print("Введите верхний предел: ");
        int lim = sc.nextInt();
        if (lim <= 0) {
            System.out.println("Верхний предел должен быть > 0");
        } else {
            double sum = 0;
            for (int n = 0; n < lim; n++) {
                long fact = 1;
                for(int i = 1; i <= n; i++) {
                    fact *= i;
                }
                double term = (Math.pow(-1, n) * Math.pow(x, 2 * n)) / fact;
                sum += term;
            }
            System.out.println("Сумма: " + sum);
        }
    }
}
