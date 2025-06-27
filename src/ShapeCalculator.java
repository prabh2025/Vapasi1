import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract class Shape {

    abstract double calculateArea();
    abstract double calculatePerimeter();
}

public class ShapeCalculator {
    public static void main(String[] args) {
        ArrayList<Shape> aObject = new ArrayList<>();

        //Run time polymorphism
        aObject.add(new Circle(5,3.14));
        aObject.add(new Triangle(5,6));
        aObject.add(new Reactangle(3,2));

        for(Shape sObject : aObject)
        {
            System.out.println("Area : "+sObject.calculateArea());
            System.out.println("Perimeter : "+sObject.calculatePerimeter());
        }

        //Compile time polymorphism
        Reactangle rObject = new Reactangle(3,2);
        System.out.println("Circle "+rObject.setDimensions(5));
        System.out.println("Reactangle : "+rObject.setDimensions(5.5,7));


        }
    }
