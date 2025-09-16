
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
    public void erase() {
        System.out.println("Erasing a shape");
    }
}
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
    @Override
    public void erase() {
        System.out.println("Erasing a Circle");
    }
}
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
    @Override
    public void erase() {
        System.out.println("Erasing a Triangle");
    }
}
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
    @Override
    public void erase() {
        System.out.println("Erasing a Square");
    }
}
public class Main2{
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();
        System.out.println("Circle:");
        circle.draw();     
        circle.erase();    
    
        System.out.println("\nTriangle:");
        triangle.draw();   
        triangle.erase();  
        
        System.out.println("\nSquare:");
        square.draw();     
        square.erase();    
    }
}
