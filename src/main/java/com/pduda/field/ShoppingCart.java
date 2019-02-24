package com.pduda.field;

public class ShoppingCart {

    private int[] price;
    private int totalPrices = 0;



    public void add(int[] price) {
        this.price = price;
    }

    public int calculateTotalPrice() {
        for (int price : price) {
            totalPrices += price ;
        }
        return totalPrices;
    }

    public boolean hasDiscount() {
        boolean isMoreThanOneHundred = false;
       for (int price: price)
            if (price>= 100)
                isMoreThanOneHundred = true;
        return isMoreThanOneHundred;

    }

    public int numberOfProducts() {
        return price.length ;
    }
}
