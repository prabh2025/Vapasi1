public class Circle extends Shape
{
    double radius;
    double pi;

    Circle(double radius,double pi)
    {
        this.radius = radius;
        this.pi = pi;
    }
    @Override
    double calculateArea() {
        System.out.print("Area of Circle ");
        return (pi*radius*radius);
    }

    @Override
    double calculatePerimeter( ) {
        System.out.println("Perimeter of Circle ");
        return (2*pi*radius);
    }
}
