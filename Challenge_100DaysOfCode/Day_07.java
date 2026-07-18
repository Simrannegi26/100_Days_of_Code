
Q13 (Conditional Statements)
Write a program to input a year and check whether it is a leap year or not using conditional statements.
Year is a leap year if divisible by 4 but not 100, except if divisible by 400.

sol- 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}

🔀
Q14 (Conditional Statements)
Write a program to input a character and check whether it is a vowel or consonant using if–else.

sol-

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
            ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}
