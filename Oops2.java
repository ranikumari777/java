class Student1{
    String name;
    String age;
    public void printinfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student1()
    {
        System.out.println("Constructor called");
    }
}
class Oops2{
    public static void main(String args[])
    {
        Student1 s=new Student1();
        s.name="Rani Kumari";
        s.age="22";

        s.printinfo();
    }
}