import java.util.Scanner;

public class Example_28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no 1:");
        int one = in.nextInt();
        System.out.println("Enter no 2:");
        int two = in.nextInt();
        if (two != 0){
            int div = one / two;
            System.out.println("The division is = "+div);
        }
        else{
            System.out.println("Error!");
        } 
    }
}
