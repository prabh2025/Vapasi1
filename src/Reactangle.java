public class Reactangle extends Shape
{
    double length;
    double width;
    Reactangle(double length,double width)
    {
        this.length = length;
        this.width = width;
    }
    @Override
    double calculateArea() {
        System.out.println("Area of Reactangle ");
        return length*width;
    }

    @Override
    double calculatePerimeter() {
        System.out.println("Perimeter  of Reactangle ");
        double res;
        res = (length+width) * 2;
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
