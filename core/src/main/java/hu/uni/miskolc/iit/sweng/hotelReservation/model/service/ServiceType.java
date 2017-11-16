package hu.uni.miskolc.iit.sweng.hotelReservation.model.service;

import java.math.BigDecimal;

public enum ServiceType {

    Ironing(new BigDecimal(200)),
    Laundry(new BigDecimal(150)),
    Breakfast(new BigDecimal(1500)),
    Lunch(new BigDecimal(2000)),
    Dinner(new BigDecimal(2222)),
    Cleaning(new BigDecimal(1999)),
    Transportation(new BigDecimal(6000)),
    Carlots(new BigDecimal(1000));

    private final BigDecimal value;

    ServiceType(BigDecimal amount) {
        this.value=amount;
    }

    public BigDecimal getValue() {
        return value;
    }
}

