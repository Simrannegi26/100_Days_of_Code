Q11 (Conditional Statements)
Write a program to input an integer and check whether it is even or odd using if–else.

sol- 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
  
🔀
Q12 (Conditional Statements)
Write a program to input an integer and check whether it is positive, negative or zero using nested if–else.

sol-
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num >= 0) {
            if (num == 0)
                System.out.println("Zero");
            else
                System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}

