class Pen{
    String color;
    String type;
    
    public void write()
    {
        System.out.println("Something write");
    }
    public void printall(){
        System.err.println(this.color);
        System.err.println(this.type);
    }
}
public class OOPS{
public static void main(String[] args) {
    Pen p1=new Pen();
    p1.color="blue";
    p1.type="gel";
    p1.write();

    Pen p2=new Pen();
    p2.color="black";
    p2.type="boll";

    p2.printall();
    p1.printall();
}
}