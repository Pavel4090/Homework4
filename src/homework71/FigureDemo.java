package homework71;

import java.util.Random;

public class FigureDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(12);
        int b = random.nextInt(24);
        int c = random.nextInt(48);
        Figure[] figures = {new Triangle(a, b, c), new Rectangle(a, b), new Circle(c), new Rectangle(a, b), new Triangle(a, b, c)};
        summaPerimeters(figures);
    }

    public static void summaPerimeters(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            double perimeter = figure.calcPerimeter();
            System.out.println("Perimeter of figure " + perimeter);
            sum += perimeter;
        }
        System.out.printf("Summ of perimeters of figures " + (String.format("%.2f ", sum)));
    }
}
