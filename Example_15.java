import java.util.Scanner;

public class Example_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value one: ");
        int value_1 = in.nextInt();
        System.out.println("Enter value two: ");
        int value_2 = in.nextInt();
        int sum = value_1 + value_2;
        System.out.println("The sum of two inputs is : "+sum);
    }
}
