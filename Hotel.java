class Hotel {
int getRoomCount() {
int totalRooms = 150;
System.out.println("Total Rooms: " + totalRooms);
return totalRooms
}
void displayManagerName(String managerName) {
System.out.println("Manager Name: " + managerName);
int rooms = getRoomCount();
System.out.println("Returned Rooms: " + rooms);
void showHotelDetails() {
System.out.println("Hotel details");
displayManagerName("Mr. Reddy");
}
}