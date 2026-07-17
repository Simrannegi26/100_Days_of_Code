🖥️
Q1 (User Inputs, Operations & Output)
Write a program to input two numbers and display their sum.

sol-
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
  
  
🖥️
Q2 (User Inputs, Operations & Output)
Write a program to input two numbers and display their sum, difference, product, and quotient.

sol-
class Solution {
    public double[] calculate(double a, double b) {
        double sum = a + b;
        double difference = a - b;
        double product = a * b;
        double quotient = a / b;

        return new double[]{sum, difference, product, quotient};
    }
}
  
