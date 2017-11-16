package hu.uni.miskolc.iit.sweng.hotelReservation.model;

import java.math.BigDecimal;

/**
 * Created by Ahmad Reda on 2017.10.19..
 * @version 1.1 updated by Basil Kaikoni .. add price mapping
 *room type enum
 */
    public enum RoomType {

        sweet(new BigDecimal("10000")),Normal(new BigDecimal("5000"));

      private final BigDecimal price;

    RoomType(BigDecimal price) {
        this.price = price;
    }

    /**
     * room type price
     * @return
     */
    public BigDecimal Price() {
        return price;
    }
}


