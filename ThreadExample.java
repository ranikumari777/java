
class C extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.err.println("Thread C: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class A extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread A: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadExample {

    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        a.start();
        c.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
