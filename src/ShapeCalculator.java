import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract class Shape {

    abstract double calculateArea(double a,double b);
    abstract double calculatePerimeter(double x,double y);
}

class Circle extends Shape {


    @Override
    double calculateArea(double a, double b) {
        return a*b;
    }

    @Override
    double calculatePerimeter(double pi, double r ) {
        double res;
        res = 2 * pi * r;
        return res;
    }
}

class Reactangle extends Shape {
    @Override
    double calculateArea(double a, double b) {
        return a*b;
    }

    @Override
    double calculatePerimeter(double x, double y) {
        double res;
        res = (x+y) * 2;
        return res;
    }

    double setDimensions(double lenWidth) {
        return lenWidth * lenWidth;
    }

    double setDimensions(double length, double width) {

        double result = length * width;
        return result;
    }
}

class Triangle extends Shape {
    @Override
    double calculateArea(double a, double b) {
        return a*b;
    }

    @Override
    double calculatePerimeter(double x, double y) {
        double res;
        res = (x*y)/2;
        return res;
    }
}



public class ShapeCalculator {
    public static void main(String[] args) {
        ArrayList<Shape> aObject = new ArrayList<>();

        aObject.add(new Circle());
        aObject.add(new Triangle());
        aObject.add(new Reactangle());

        }
    }
