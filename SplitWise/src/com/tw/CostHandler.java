package com.tw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class CostHandler {
    private static final Logger logger = Logger.getLogger(CostHandler.class.getName());

    public List<Cost> readExpensesFromFile(String fileName) {
        List<Cost> expenses = new ArrayList<>();

        try (BufferedReader bufferReader = new BufferedReader(new FileReader(fileName))) {
            String lineReader;

            while ((lineReader = bufferReader.readLine()) != null) {
                logger.info("Reading line from the File " + lineReader);
                String[] firstWords = lineReader.split(" spent ");
                String payer = firstWords[0].trim();
                String[] secondWord = firstWords[1].split(" for ", 2);
                int amount = Integer.parseInt(secondWord[0].trim());

                String partition = secondWord[1].replaceAll(".*for", "").trim();
                String[] patronFormation = partition.split(",\\s*");

                List<String> patronsList = Arrays.stream(patronFormation).map(String::trim).filter(s -> !s.isEmpty()).collect(Collectors.toList());
                expenses.add(new Cost(payer, amount, patronsList));
            }
        } catch (IOException e) {
            logger.severe("Error from Reading the file : " + e.getMessage());
        }
        return expenses;
    }

    public List<String> calculateTheExpenses(List<Cost> expenses) {
        List<String> dealings = new ArrayList<>();
        Map<String, Map<String,Integer>> debits = new HashMap<>();

        for (Cost expense : expenses) {
            String payer = expense.getPayer();
            int amount = expense.getAmount();
            List<String> members = expense.getMembers();

            int share = amount / members.size();

            for (String member : members) {
                if (!member.equals(payer)) {
                    debits.computeIfAbsent(member , Z-> new HashMap<>()).merge(payer,share,Integer::sum);
                }
            }
        }

        for(Map.Entry<String, Map<String,Integer>> debitorEntry : debits.entrySet())
        {
            String debitors = debitorEntry.getKey();
            for(Map.Entry<String,Integer> creditorEntry : debitorEntry.getValue().entrySet()){
                String creditor = creditorEntry.getKey();
                int totalAmount = creditorEntry.getValue();

                dealings.add(debitors+" pays "+creditor+" "+totalAmount);
            }
        }
        return dealings;
    }
}
