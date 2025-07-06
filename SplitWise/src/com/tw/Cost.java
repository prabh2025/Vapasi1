package com.tw;

import java.util.List;

public class Cost {

    private String payer;
    private int amount;
    private List<String> members;

    Cost(){}

    public Cost(String payer, int amount, List<String> members) {
        this.payer = payer;
        this.amount = amount;
        this.members = members;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
}
