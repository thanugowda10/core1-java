class Train {

   
    int getSeatCount() {
        int totalSeats = 720;
        System.out.println("Total Seats: " + totalSeats);
        return totalSeats;
    }

   
    void displayTrainName(String trainTitle) {
        System.out.println("Train Name: " + trainTitle);

       
        int seats = getSeatCount();
        System.out.println("Returned Seats: " + seats);
    }

  
    void showJourney() {
        System.out.println("Train details");

       
        displayTrainName("Express Line");
    }
}

