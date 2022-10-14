import java.util.Scanner;

public class Example_30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no 1:");
        int one = in.nextInt();
        System.out.println("Enter no 2:");
        int two = in.nextInt();
        if ( one > two ){
            System.out.println("Input one is larger "+one);
        }
        else{
            System.out.println("Input two is larger "+two);
        }
    }
}
