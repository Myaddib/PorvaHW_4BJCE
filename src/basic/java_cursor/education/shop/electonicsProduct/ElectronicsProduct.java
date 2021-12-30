package basic.java_cursor.education.shop.electonicsProduct;

import basic.java_cursor.education.shop.AgeRestriction;
import basic.java_cursor.education.shop.Product;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class ElectronicsProduct extends Product {
    String name;
    double price;
    int quantity;
    AgeRestriction ageRestriction;
    Date dateOfManufacture;
    Date validity;

    public void ElectronicsProduct(String name, double price, int quantity, AgeRestriction ageRestriction, Date dateOfManufacture, Date validity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageRestriction = ageRestriction;
        this.dateOfManufacture = dateOfManufacture;
        this.validity=validity;
    }
    public void ElectronicsProduct(String name, double price, int quantity, AgeRestriction ageRestriction) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageRestriction = ageRestriction;
        Calendar validity = new GregorianCalendar();
        this.dateOfManufacture = validity.getTime();
        if(this.name == "Computer"){
        validity.add(Calendar.DAY_OF_YEAR, 711);
        this.validity = validity.getTime();
        } else{
            validity.add(Calendar.DAY_OF_YEAR, 180);
            this.validity = validity.getTime();
        }

    }
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getPrice() {
        if(this.name == "Computer" && this.quantity>=1000) {
            return price * 0.95;
        }
        if(this.name == "Appliance" && this.quantity<=50) {
            return price * 1.05;
        }
        return price;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    public AgeRestriction getAgeRestriction() {

        return ageRestriction;
    }

    public Date getDateOfManufacture() {

        return dateOfManufacture;
    }


    public Date getValidity() {

        return validity;
    }

}
