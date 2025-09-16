class Stud {
    String name;
    String age;

    public void printin(String name) {
        System.out.println(name);
    }
    public void printin(int name) {
        System.out.println(name);
    }
   

    public void printin(String name, String age) {
        System.out.println(name + " " + age);
    }

}

public class Polymorphism {
    public static void main(String[] args) {  // Fixed main method
        Stud sm = new Stud();
        sm.name = "Ravi";
        sm.age = "26";
        sm.printin(sm.name,sm.age);  // Calls the correct overloaded method
    }
}
