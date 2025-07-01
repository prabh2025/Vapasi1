public class Triangle extends Shape
{
    double base;
    double height;

    Triangle(double base,double height)
    {
        this.base = base;
        this.height = height;
    }
    @Override
    double calculateArea() {
        System.out.println("Area of Triangle ");
        return base*height;
    }

    @Override
    double calculatePerimeter() {
        System.out.println("Perimeter of Triangle ");
        double res;
        res = (base*height)/2;
        return res;
    }
}
