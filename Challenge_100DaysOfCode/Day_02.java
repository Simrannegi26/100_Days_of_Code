🖥️
Q3 (User Inputs, Operations & Output)
Write a program to calculate the area and perimeter of a rectangle given its length and breadth.

sol-
class Solution {
    public int[] calculate(int length, int breadth) {
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        return new int[]{area, perimeter};
    }
}

  
🖥️
Q4 (User Inputs, Operations & Output)
Write a program to calculate the area and circumference of a circle given its radius.

sol-
class Solution {
    public double[] calculate(double radius) {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        return new double[]{area, circumference};
    }
}
