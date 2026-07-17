Q9 (User Inputs, Operations & Output)
Write a program to calculate simple and compound interest for given principal, rate, and time.

sol-
class InterestCalculator {
    public double[] calculate(double principal, double rate, double time) {
        double simpleInterest = (principal * rate * time) / 100;
        double compoundInterest =
                principal * Math.pow(1 + rate / 100, time) - principal;

        return new double[]{simpleInterest, compoundInterest};
    }
}



🖥️
Q10 (User Inputs, Operations & Output)
Write a program to input time in seconds and convert it to hours:minutes:seconds format.

sol-
class TimeConverter {
    public int[] convert(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        return new int[]{hours, minutes, remainingSeconds};
    }
}
