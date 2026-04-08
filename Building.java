class Building {

   
    int getFloors() {
        int totalFloors = 10;
        System.out.println("Total Floors: " + totalFloors);
        return totalFloors;
    }

  
    void displayType(String buildingType) {
        System.out.println("Building Type: " + buildingType);

       
        int floors = getFloors();
        System.out.println("Returned Floors: " + floors);
    }

    
    void showDetails() {
        System.out.println("Building details");

    
        displayType("Apartment");
    }
}