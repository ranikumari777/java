class Student3{
    String name;
    String age;
    public void printinfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student3(Student3 s1)
    {
       System.out.println("copy constror");
       this.name=s1.name;
       this.age=s1.age;
       
    }
}
class Oops4{
    public static void main(String args[])
    {
        Student3 s =new Student3();
        s.name="Rani";
        s.age="22";
        Student3 s1 =new Student3(s);
        s1.printinfo();
    }
}