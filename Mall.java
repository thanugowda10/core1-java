class Mall {

   
    int getShopCount() {
        int totalShops = 85;
        System.out.println("Total Shops: " + totalShops);
        return totalShops;
    }

   
    void displayMallName(String mallTitle) {
        System.out.println("Mall Name: " + mallTitle);

       
        int shops = getShopCount();
        System.out.println("Returned Shops: " + shops);
    }

  
    void showDetails() {
        System.out.println("Mall details");

      
        displayMallName("City Center Mall");
    }
}

