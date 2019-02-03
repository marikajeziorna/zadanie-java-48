import java.util.Scanner;

public class SumNumbers {
    public static void countNumbers() {
        int sum;
        System.out.println("Give number: ");
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        sum = 0;
        while (nextInt != 0) {
            sum += nextInt % 10;
            nextInt /= 10;
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}