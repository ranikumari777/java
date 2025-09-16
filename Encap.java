class A {
    private int value;

    public void setValue(int x) {
        this.value = x;
    }
    public int getValue() {
        return value;
    }
}

class B extends A {
    private int y;

    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
}

public class Encap {
    public static void main(String[] args) {
        B obj = new B();
        obj.setValue(5);   // from class A
        obj.setY(10);      // from class B

        System.out.println(obj.getValue() +   " "    + obj.getY());
    }
}
