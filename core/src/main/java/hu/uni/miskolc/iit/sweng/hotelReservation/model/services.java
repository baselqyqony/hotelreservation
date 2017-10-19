package hu.uni.miskolc.iit.sweng.hotelReservation.model;

public class services {

   private ServiceType type;
   private int ID;
   private int price;


    public services(ServiceType type, int ID, int price) {
        this.type = type;
        this.ID = ID;
        this.price = price;
    }

    public ServiceType getType() {
        return type;
    }

    public int getID() {
        return ID;
    }

    public int getPrice() {
        return price;
    }

    public void setType(ServiceType type) {
        this.type = type;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}

