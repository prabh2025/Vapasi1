
public class MyCalApp {
    public static void main(String[] args) {

    Calculator calObject = new Calculator(6);
    System.out.println(calObject.operation());

    Calculator calObject1 = new Calculator(-1);
    System.out.println(calObject1.operation());

    Calculator calObject2 = new Calculator(0);
    System.out.println(calObject2.operation());


    }
}