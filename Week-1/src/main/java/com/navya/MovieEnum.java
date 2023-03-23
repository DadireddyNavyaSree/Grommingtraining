package com.navya;

public enum MovieEnum {
    PVR("RRR", 300),
    CINEPOLIS("PUSHPA", 350),
    IMAX("BAHUBALI", 250);

    private final String name;
    private final int price;

    private MovieEnum(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
