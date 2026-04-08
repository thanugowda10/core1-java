class Hotel {

   
    int getRoomCount() {
        int totalRooms = 120;
        System.out.println("Total Rooms: " + totalRooms);
        return totalRooms;
    }


    void displayHotelName(String hotelName) {
        System.out.println("Hotel Name: " + hotelName);

     
        int rooms = getRoomCount();
        System.out.println("Returned Rooms: " + rooms);
    }

  
    void showInfo() {
        System.out.println("Hotel details");

       
        displayHotelName("Grand Palace");
    }
}


