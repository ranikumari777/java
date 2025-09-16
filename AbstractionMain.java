// package abstraction;

public class AbstractionMain {
public static void main(String[] args)
{
    Sum s=new Clac();
    System.err.println("sum"+s.add(2,3));
}
//abstract class is a special class that declear with abstract keyword and its object can not be directly instance.....
//-> it born to be inherit , it use for inheritance

//interface-> interface is a template for a class
//all method in interface are by defult public and absrract
//all veriable in interface are by defult public static and final
abstract class Sum{
   abstract  int add(int n1,int n2);
   void display()
   {
    System.err.println("This is display of sum class");
   }
}

public Calc extends Sum{
    @Override

}

interface Mul{
    double pi=3.14;
    int multiply(int n1,int n2);
    void msg();
}

interface  Div{
    double pi=3.14;
    int multiply(int n1,int n2);
    void msg();
}
}