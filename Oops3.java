class Student2{
    String name;
    String age;
    public void printinfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student2(String name,String age)
    {
       System.out.println("Parametrized constror");
       this.name=name;
       this.age=age;
       
    }
}
class Oops3{
    public static void main(String args[])
    {
        Student2 s=new Student2("Suraj Dubey","24");
        Student2 s1=new Student2("Rani Kumari","24");
        s.printinfo();
        s1.printinfo();
    }
}