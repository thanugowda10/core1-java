class Airport {
int getFlightCount() {
int totalFlights = 220;
System.out.println("Total Flights: " + totalFlights);
return totalFlights
}
void displayAirportName(String airportName) {
System.out.println("Airport Name: " + airportName);
int flights = getFlightCount();
System.out.println("Returned Flights: " + flights);
}
void showAirportDetails() {
System.out.println("Airport details");
displayAirportName("Kempegowda Airport");
}
}