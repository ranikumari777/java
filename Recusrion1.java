public class Recusrion1{
    public static void printfun(int n) {
        if(n==6){
            return;
        }
        System.out.println(n);
        printfun(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        printfun(n);
    }
}