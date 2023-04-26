package com.navya.singleton;

import static java.time.chrono.HijrahChronology.INSTANCE;

public  enum Enums {
    INSTANCE;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
