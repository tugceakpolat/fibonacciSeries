import java.util.Scanner;
public class fibonscci {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int total;
        int entry;

        Scanner user = new Scanner(System.in);

        System.out.print("Enter the number of elements of the Fibonacci series : ");
        entry = user.nextInt();
        System.out.print("Fibonacci value : ");

        for (int start =1; start <= entry; start++){
            System.out.print(num1 + " ,");
           total = num1 + num2;
           num1=num2;
           num2=total;
        }


    }

}
