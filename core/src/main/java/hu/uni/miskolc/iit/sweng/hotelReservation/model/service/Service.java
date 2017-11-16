package hu.uni.miskolc.iit.sweng.hotelReservation.model.service;

import hu.uni.miskolc.iit.sweng.hotelReservation.model.CurrencyType;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.Price;

import java.math.BigDecimal;

public class Service {

   private ServiceType type;
   private int ID;
   private Price price;


    public Service(ServiceType type, int ID) {
        this.type = type;
        this.ID = ID;
        this.price=new Price(type.getValue());
    }

    public ServiceType getType() {
        return type;
    }

    public int getID() {
        return ID;
    }



    public void setType(ServiceType type) {
        this.type = type;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPrice(BigDecimal Price) {
        this.price.setAmount(Price);
    }
    public void setCurrency(CurrencyType ct){ this.price.setCurrencyType(ct);}
    public BigDecimal getPrice(){return price.getAmount();}


}

