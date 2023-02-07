package homework71;

import java.util.Objects;

public class Triangle extends Figure {
    private static final double AREA_COEFF = 0.5;
    private static final double PERIMETER_COEFF = 2;

    private final int a;
    private final int b;
    private final int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    public double calcPerimeter() {
        return (PERIMETER_COEFF * caclSquare()) / c;
    }


    @Override
    public double caclSquare() {
        return AREA_COEFF * a * b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Triangle triangle)) return false;
        return a == triangle.a && b == triangle.b && c == triangle.c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "triangleA " + a +
                ", triangleB " + b +
                ", triangleC " + c +
                '}';
    }
}
