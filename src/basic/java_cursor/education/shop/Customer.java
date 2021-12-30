package basic.java_cursor.education.shop;

public class Customer {
    private String name;
    private int age;
    private double balanct;

    public void Customer(String name, int age, double balanct) {
        this.name = name;
        this.age = age;
        this.balanct = balanct;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }


    public double getBalanct() {

        return balanct;
    }

    public void setBalanct(double balanct) {
        this.balanct = balanct;
    }
}