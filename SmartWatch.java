class SmartWatch{
int calulaterPrice(){
int watchPrice = 800;
System.out.println("Watch Price is:" + watchPrice);
return watchPrice;
}
void displayModel(String modelName){
System.out.println(Model Name is:" + modelName);
int resultPrice = calulaterPrice();
System.out.println("Returned watch Price:" + resultPrice);
}
void showWatchDetails(){
System.out.println("Smart Watch details");
calling displayModel("Appple Watch");
}
}