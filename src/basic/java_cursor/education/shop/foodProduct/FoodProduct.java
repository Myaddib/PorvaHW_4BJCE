package basic.java_cursor.education.shop.foodProduct;

import basic.java_cursor.education.shop.AgeRestriction;
import basic.java_cursor.education.shop.Product;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class FoodProduct extends Product {
    String name;
    double price;
    int quantity;
    AgeRestriction ageRestriction;
    Date dateOfManufacture;
    Date validity;

    public void FoodProduct(String name, Double price, int quantity, AgeRestriction ageRestriction) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageRestriction = ageRestriction;
        Calendar validity = new GregorianCalendar();
        this.dateOfManufacture = validity.getTime();
        validity.add(Calendar.DAY_OF_YEAR, 30);
        this.validity =  validity.getTime();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        Date c = new Date();
        int z = calculateDifference(c,this.dateOfManufacture );

        if (z<=15){
            return price*0.7;
        }
        return price;
    }

    public int getQuantity() {

        return quantity;
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

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }
}
