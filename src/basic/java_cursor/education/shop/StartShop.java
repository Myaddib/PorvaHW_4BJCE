package basic.java_cursor.education.shop;

import basic.java_cursor.education.shop.foodProduct.FoodProduct;

import static basic.java_cursor.education.shop.AgeRestriction.Adult;
import static basic.java_cursor.education.shop.AgeRestriction.Teenager;

public class StartShop {

    private void init() {

        FoodProduct cigars = new FoodProduct("420 Blaze it fgt", 6.90, 1400, AgeRestriction.Adult);


        Customer pecata = new Customer("Pecata", 17, 30.00);
        PurchaseManager.processPurchase(pecata, cigars);

        Customer gopeto = new Customer("Gopeto", 18, 0.44);
        PurchaseManager.processPurchase(gopeto, cigars);
    }


    //*****************
    static public class PurchaseManager {
        //Create a static class PurchaseManager. The class should hold the
        //processPurchase(Product product, Customer customer) method that
        //handles purchases (takes money from customer, reduces product quantity by 1).
        //The PurchaseManager should throw exceptions with descriptive messages
        // in the following situations: · If the product is out of stock (i.e. no quantity)
        //· If the product has expired
        //· If the buyer does not have enough money
        //· If the buyer does not have permission to purchase the given product
        //Catch any exceptions in your main() method and print their message.

        static public void processPurchase(Customer customerBuy, Product productBuy) {
            if ((customerBuy.getBalanct() > productBuy.price) && productBuy.quantity > 0) {
                if (customerBuy.getAgeRestriction() == Adult) {
                    productBuy.setQuantity(productBuy.getQuantity() - 1);
                    customerBuy.setBalanct(customerBuy.getBalanct() - productBuy.getPrice());

                } else if (Teenager == customerBuy.getAgeRestriction()) {
                    productBuy.setQuantity(productBuy.getQuantity() - 1);
                    customerBuy.setBalanct(customerBuy.getBalanct() - productBuy.getPrice());

                } else {
                    productBuy.setQuantity(productBuy.getQuantity() - 1);
                    customerBuy.setBalanct(customerBuy.getBalanct() - productBuy.getPrice());

                }
            } else {
                if (customerBuy.getBalanct() > productBuy.getPrice()) {
                    System.out.println("there are not enough funds in the account");
                } else {
                    System.out.println("Missing goods: " + productBuy.getName());
                }
            }
        }

    }

    public void startShop() {
        init();
    }

}

