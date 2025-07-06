package com.tw;

import java.util.List;
import java.util.logging.Logger;

public class CostSplitter {

    private static final Logger logger = Logger.getLogger(CostSplitter.class.getName());

    public static void main(String[] args)
    {
        CostHandler handler = new CostHandler();
        String inputFile = "/Users/prabjotr/IdeaProjects/Shape/SplitWise/src/com/tw/Input.txt";

        logger.info("String the cost Splitter");

        try {
            List<Cost> expenses = handler.readExpensesFromFile(inputFile);
            List<String> dealings = handler.calculateTheExpenses(expenses);

            System.out.println("List of transactions");
            for (String deal : dealings) {
                System.out.println(deal);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
