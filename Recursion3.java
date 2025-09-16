
public class Recursion3 {

    public static void sumfun(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        sumfun(i + 1, n, sum);
    }

    public static void main(String[] args) {
        sumfun(1, 5, 0);
    }
}
