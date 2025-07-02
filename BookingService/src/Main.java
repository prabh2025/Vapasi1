import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        ExecutorService poolService = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 5; i++) {

            poolService.execute(new BookingRequest(" Consumer "));

        }

        poolService.shutdown();

    }
}