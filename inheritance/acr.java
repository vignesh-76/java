package inheritance;
class Shape {
    double area;
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    void calculate() {
        area = 3.14 * r * r;
        System.out.println("Circle area: " + area);
    }
}

class Rectangle extends Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    void calculate() {
        area = l * b;
        System.out.println("Rectangle area: " + area);
    }
}

public class acr {
    public static void main(String[] args) {

        Circle obj = new Circle(5);
        obj.calculate();

        Rectangle obj1 = new Rectangle(4, 6);
        obj1.calculate();
    }
}
