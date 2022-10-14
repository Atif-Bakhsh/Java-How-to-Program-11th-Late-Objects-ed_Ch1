import java.util.Scanner;

public class Example_32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no 1:");
        int one = in.nextInt();
        System.out.println("Enter no 2:");
        int two = in.nextInt();
        System.out.println("Enter no 3; ");
        int three = in.nextInt();
        if ( one > two && one > three ){
            System.out.println("Input one is larger "+one);
        }
        if ( two > one && two > three){
            System.out.println("Input two is larger "+two);
        }
        else{
            System.out.println("Input three is larger "+three);
        }
    }
}
