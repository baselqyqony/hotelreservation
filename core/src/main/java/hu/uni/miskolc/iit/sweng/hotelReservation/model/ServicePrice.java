package hu.uni.miskolc.iit.sweng.hotelReservation.model;

public class ServicePrice {

    private double ServicePrice;
    private ServiceType type;

    public ServicePrice(double servicePrice) {
        ServicePrice = servicePrice;
    }

    public double getServicePrice() {
        return ServicePrice;
    }

    public void setServicePrice(double servicePrice) {
        ServicePrice = servicePrice;
    }

    public void setType(ServiceType type) {
        this.type = type;
    }
}
