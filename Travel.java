class Travel {
    int getDistance() {
        int totalDistance = 250;
        System.out.println("Total Distance: " + totalDistance + " km");
        return totalDistance;
    }
    void displayDestination(String placeName) {
        System.out.println("Destination: " + placeName);

 
        int distance = getDistance();
        System.out.println("Returned Distance: " + distance);
    }

  
    void showPlan() {
        System.out.println("Travel details");

       
        displayDestination("Goa");
    }
}

