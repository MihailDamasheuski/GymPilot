package com.domashevsky.mihail.gympilot.water;

public class WaterItem {

    private String amount;
    private String date;

    public WaterItem(String amount, String date) {
        this.amount = amount;
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }
}
