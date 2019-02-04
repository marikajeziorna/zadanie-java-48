import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give number: ");
        int number = scanner.nextInt();
        System.out.println(SumNumbers.sumNumbers(number));
    }
}
