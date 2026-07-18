Q17 (Conditional Statements)
Write a program to find the roots of a quadratic equation and categorize them.

sol-
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = b*b - 4*a*c;

        if(d > 0)
            System.out.println("Two Real and Different Roots");
        else if(d == 0)
            System.out.println("Two Real and Equal Roots");
        else
            System.out.println("Imaginary Roots");
    }
}

🔀
Q18 (Conditional Statements)
Write a program that accepts a percentage (0-100) and assigns a grade based on the following criteria: 
90-100: Grade A 
80-89: Grade B 
70-79: Grade C 
60-69: Grade D 
below 60: Grade F.

sol-
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int per = sc.nextInt();

        if(per>=90)
            System.out.println("Grade A");
        else if(per>=80)
            System.out.println("Grade B");
        else if(per>=70)
            System.out.println("Grade C");
        else if(per>=60)
            System.out.println("Grade D");
        else
            System.out.println("Grade F");
    }
}
