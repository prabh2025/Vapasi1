package con.tw.Test;

import com.tw.Cost;
import com.tw.CostHandler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCostSplitter {

    @TempDir
    Path path;

    @Test
    void testReadFromEmptyFile()throws Exception{
        Path file = path.resolve("Second.txt");
        Files.writeString(file,"");
        CostHandler handler = new CostHandler();
        List<Cost> result = handler.readExpensesFromFile((file.toString()));
        System.out.println("Empty List for empty file: " + result.isEmpty());
        assertTrue(result.isEmpty(),"Empty List for empty file");
    }

   @Test
    void testForZeroAmount(){
       List<Cost> expenses = List.of(new Cost("A",0,List.of("B","C")));
       CostHandler handler = new CostHandler();
       List<String> result = handler.calculateTheExpenses(expenses);
       System.out.println("Zero Amount :"+ result.stream().allMatch(line -> line.endsWith("0")));
       assertTrue(result.stream().allMatch(line -> line.endsWith("0")),"Zero Amount");
   }

}
