
class Number {
    private double num;
    public Number(double num) {
        this.num = num;
    }
    public boolean isZero() {
        return num == 0;
    }
    public boolean isPositive() {
        return num > 0;
    }
    public boolean isNegative() {
        return num < 0;
    }
    public boolean isOdd() {
        if (num % 1 == 0) {
            return ((int) num) % 2 != 0;
        }
        return false;
    }
    public boolean isEven() {
        if (num % 1 == 0) {
            return ((int) num) % 2 == 0;
        }
        return false; 
    }
    public boolean isPrime() {
        if (num <= 1 || num % 1 != 0) {
            return false; 
        }
        int n = (int) num;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isArmstrong() {
        if (num % 1 != 0) {
            return false; 
        }
        int n = (int) num;
        int sum = 0, temp = n, digits = 0;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        temp = n;
        while (temp != 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp /= 10;
        }
        return sum == n;
    }
    public double getNum() {
        return num;
    }
}
public class Main3{
    public static void main(String[] args) {
        Number number = new Number(153);
        System.out.println("Is Zero: " + number.isZero());
        System.out.println("Is Positive: " + number.isPositive());
        System.out.println("Is Negative: " + number.isNegative());
        System.out.println("Is Odd: " + number.isOdd());
        System.out.println("Is Even: " + number.isEven());
        System.out.println("Is Prime: " + number.isPrime());
        System.out.println("Is Armstrong: " + number.isArmstrong());
    }
}
