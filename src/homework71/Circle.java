package homework71;

import java.util.Objects;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double caclSquare() {
        return Math.PI * (radius * radius);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Circle circle)) return false;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
