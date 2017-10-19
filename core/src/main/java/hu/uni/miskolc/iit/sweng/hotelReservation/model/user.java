package hu.uni.miskolc.iit.sweng.hotelReservation.model;
/**
 * Created by Kaikoni Basil on 2017.10.19
 */
public class user {
    private  int ID ;
    private string name;
    private Nationality nationality;
    private string phone;
    private string address;
    private string Email;

    public user(int ID, string name, Nationality nationality, string phone, string address, string email) {
        this.ID = ID;
        this.name = name;
        this.nationality = nationality;
        this.phone = phone;
        this.address = address;
        Email = email;
    }

    public void setName(string name) {
        this.name = name;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public void setPhone(string phone) {
        this.phone = phone;
    }

    public void setAddress(string address) {
        this.address = address;
    }

    public void setEmail(string email) {
        Email = email;
    }

    public int getID() {
        return ID;
    }

    public string getName() {
        return name;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public string getPhone() {
        return phone;
    }

    public string getAddress() {
        return address;
    }

    public string getEmail() {
        return Email;
    }


}
