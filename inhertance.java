class Shape{
    String color;
}
class Traingle extends Shape{

    public void printall(){
        System.err.println(this.color);
    
    }
}

public class inhertance{
    public static void main(String args[])
    {
        Traingle t=new Traingle();
        t.color="red";
        t.printall();
    }
}