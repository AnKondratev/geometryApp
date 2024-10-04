package org.example;

import frank.GeometryUtils;
import org.example.model.Circle;
import org.example.model.Rectangle;
import org.example.model.Triangle;

public class Main {
    public static void main(String[] args) {
        GeometricFigure circle = new Circle(10);
        System.out.printf("Area of circle is %.02f \n", circle.area()); // Area of circle is 314,16
        System.out.printf("Perimeter of circle is %.02f \n", circle.perimeter()); // Perimeter of circle is 62,83
        System.out.println();

        GeometricFigure rectangle = new Rectangle(10, 20);
        System.out.printf("Area of rectangle is %.02f \n", rectangle.area()); // Area of rectangle is 200,00
        System.out.printf("Perimeter of rectangle is %.02f \n", rectangle.perimeter()); // Perimeter of rectangle is 60,00
        System.out.println();

        GeometricFigure triangle = new Triangle(20, 20, 30);
        System.out.printf("Area of triangle is %.02f \n", triangle.area()); // Area of triangle is 198,43
        System.out.printf("Perimeter of triangle is %.02f \n", triangle.perimeter()); // Perimeter of triangle is 70,00
        System.out.println();

        GeometryUtils frank = new GeometryUtils();
        System.out.println(frank.FrankensteinsFun(circle, rectangle));
        System.out.println(frank.FrankensteinsFun(circle, circle));

        //update 1.1.0-SNAPSHOT  - работа с тремя фигурами
        System.out.println();
        System.out.println(frank.FrankensteinsFun(circle, rectangle, triangle));

        ThreeDimensionalFigure cube = new Cube(25);
        System.out.printf("Area of cube is %.02f \n", cube.area());
        System.out.printf("Volume of cube is %.02f \n", cube.volume());
    }
}