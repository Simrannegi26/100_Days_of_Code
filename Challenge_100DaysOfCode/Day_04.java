Q7 (User Inputs, Operations & Output)
Write a program to swap two numbers without using a third variable.

sol-
class SwapNumbers {
    public int[] swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        return new int[]{a, b};
    }
}

🖥️
Q8 (User Inputs, Operations & Output)
Write a program to find and display the sum of the first n natural numbers.

sol-
class SumNaturalNumbers {
    public int findSum(int n) {
        return n * (n + 1) / 2;
    }
}
