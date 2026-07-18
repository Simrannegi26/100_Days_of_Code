🔀
Q15 (Conditional Statements)
Write a program to input a character and check whether it is an uppercase alphabet, lowercase alphabet, digit, or special character.

sol-
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch>='A' && ch<='Z')
            System.out.println("Uppercase");
        else if(ch>='a' && ch<='z')
            System.out.println("Lowercase");
        else if(ch>='0' && ch<='9')
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }
}

🔀
Q16 (Conditional Statements)
Write a program to input three numbers and find the largest among them using if–else.

sol-

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>=b && a>=c)
            System.out.println(a);
        else if(b>=a && b>=c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}
