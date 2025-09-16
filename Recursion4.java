


public class Recursion4{
    public static int sumfun(int n) {
        if(n==1)
        {
            return 1;
        }
       return n+sumfun(n-1);

    }
    public static void main(String[] args) {
        System.out.println("This is Sum of total numbers:"+sumfun(5));
    }
}