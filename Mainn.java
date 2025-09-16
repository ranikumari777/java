class Parent {
    Parent() {
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent {
    Child() {
        super(); // parent ka constructor call karna
        System.out.println("Child class constructor");
    }
}

public class Mainn {
    public static void main(String[] args) {
        Child c = new Child(); 
    }
}
