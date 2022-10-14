import java.util.Scanner;

public class Example_27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no 1:");
        int one = in.nextInt();
        System.out.println("Enter no 2:");
        int two = in.nextInt();
        int min = one - two;
        System.out.println("The minus is = "+min);
    }
}
