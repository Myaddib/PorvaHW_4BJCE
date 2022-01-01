package basic.java_cursor.education.shop;

public class Customer {
    private String name;
    private int age;
    private double balanct;
    private final AgeRestriction ageRestriction;

    public Customer(String name, int age, double balanct) {
        this.name = name;
        this.age = age;
        this.balanct = balanct;
        if (age < 18) {
            this.ageRestriction = AgeRestriction.Teenager;

        } else {
            this.ageRestriction = AgeRestriction.Adult;

        }
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

    public AgeRestriction getAgeRestriction() {
        return ageRestriction;
    }
}