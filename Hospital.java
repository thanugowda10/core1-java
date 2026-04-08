class Hospital{
int getBedsCount(){
int tatalbeds = 120;
System.out.println("Total Beds:" + tatalbeds);
return totalBeds;
}
void displayDoctorName(String doctorName){
System.out.println("Doctor Name:" + doctorName);
int  beds = getBedsCount();
System.out.println("Returned Beds:" + beds);
}
void showHospitaldetails(){
System.out.println("Hospital details");
displayDoctorName("Dr. Mehta");
}
}