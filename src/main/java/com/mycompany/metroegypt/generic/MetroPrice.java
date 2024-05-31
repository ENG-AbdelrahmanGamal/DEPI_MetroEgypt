package com.mycompany.metroegypt.generic;

public enum MetroPrice {
    PRICE_ONE(3), PRICE_TWO(8), PRICE_THREE(12), PRICE_FOUR(14);

    private final int price;


    MetroPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }


}