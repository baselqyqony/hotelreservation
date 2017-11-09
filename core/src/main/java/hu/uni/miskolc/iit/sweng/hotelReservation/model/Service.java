package hu.uni.miskolc.iit.sweng.hotelReservation.model;

public class Service {

   private ServiceType type;
   private int ID;
   private int Price;


    public Service(ServiceType type, int ID, int Price) {
        this.type = type;
        this.ID = ID;
        this.Price = Price;
    }

    public ServiceType getType() {
        return type;
    }

    public int getID() {
        return ID;
    }

    public int getPrice() {
        return Price;
    }

    public void setType(ServiceType type) {
        this.type = type;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }


}

