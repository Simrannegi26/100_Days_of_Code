🖥️
Q5 (User Inputs, Operations & Output)
Write a program to convert temperature from Celsius to Fahrenheit.

sol-
class CelsiusToFahrenheit {
    public double convert(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

🖥️
Q6 (User Inputs, Operations & Output)
Write a program to swap two numbers using a third variable.

sol- 
class SwapNumbers {
    public int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        return new int[]{a, b};
    }
}
