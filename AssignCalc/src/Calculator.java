public class Calculator {

    int value;
    Calculator(int value)
    {
        this.value = value;
    }

    double operation()
    {
        if(value == 0)
        {
            throw new MyAirthException("Zero Not allowed");
        }
        else if(value < 0)
        {
            throw new MyAirthException("Negative not allowed");
        }
        else
            return (double)(value * value);

    }
}
