
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Integer[] numbers = {12, 45, 67, 8, 91, 15, 85, 68, 12, 15};

        int sum = Arrays.stream(numbers).filter(n -> n < 15).map(n -> n + 10).sum();

        double average = Arrays.stream(numbers)
                .filter(n -> n < 15)
                .map(n -> n + 10).average()
                .getAsDouble();

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
