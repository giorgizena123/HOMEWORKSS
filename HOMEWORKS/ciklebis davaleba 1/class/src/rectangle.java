import static java.lang.Math.sqrt;

public class rectangle {
    double a;
    double b;

    rectangle(double length, double width) {
        a = length;
        b = width;
    }


    void perimeter() {
        System.out.println("perimeter=" +(a+b)*2);
    }

    void area() {
        System.out.println("area=" + a * b);
    }

    void diagonal() {
        System.out.println("diagonal=" + sqrt(a * a + b * b));
    }

    void isSquare() {
        if (a == b) {
            System.out.println("square");
        } else {
            System.out.println("rectangle");
        }
    }
}
