package hu.uni.miskolc.iit.sweng.hotelReservation.model.user;
/**
 * Created by Kaikoni Basil on 2017.10.19
 */
public class User {
    private  int ID ;
    private String name;
    private Nationality nationality;
    private String phone;
    private String address;
    private String Email;

    public User(int ID, String name, Nationality nationality, String phone, String address, String email) {
        this.ID = ID;
        this.name = name;
        this.nationality = nationality;
        this.phone = phone;
        this.address = address;
        Email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return Email;
    }


}
