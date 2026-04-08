class Restaurant {

    int getMenuCount() {
        int totalItems = 60;
        System.out.println("Total Menu Items: " + totalItems);
        return totalItems;
    }


    void displayChefName(String chefName) {
        System.out.println("Chef Name: " + chefName);

       
        int items = getMenuCount();
        System.out.println("Returned Items: " + items);
    }

   
    void showRestaurantDetails() {
        System.out.println("Restaurant details");

       
        displayChefName("Chef Arjun");
    }
}