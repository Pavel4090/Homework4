package homework71;

import java.util.Objects;

public class Rectangle extends Figure {
    private static final double COEFF = 2;
    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcPerimeter() {
        return COEFF * (a + b);
    }

    @Override
    public double caclSquare() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "rectangleA " + a +
                ", rectangleB " + b +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle rectangle)) return false;
        return a == rectangle.a && b == rectangle.b;
    }
}
