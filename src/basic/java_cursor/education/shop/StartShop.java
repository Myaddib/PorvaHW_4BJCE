package basic.java_cursor.education.shop;

import basic.java_cursor.education.shop.foodProduct.FoodProduct;

public class StartShop {

    private void init() {

        FoodProduct cigars = new FoodProduct("420 Blaze it fgt", 6.90, 1400, AgeRestriction.Adult);

        Customer pecata = new Customer("Pecata", 17, 30.00);
        PurchaseManager.processPurchase(pecata, cigars);

        Customer gopeto = new Customer("Gopeto", 18, 0.44);
        PurchaseManager.processPurchase(gopeto, cigars);
    }

    public void startShop() {
        init();
    }
}
