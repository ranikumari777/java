class Student{
    String name;
    String age;
    public void printinfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
class Oops1{
    public static void main(String args[])
    {
        Student s=new Student();
        s.name="Rani Kumari";
        s.age="22";

        s.printinfo();
    }
}