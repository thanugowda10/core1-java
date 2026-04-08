class Backpack{
int computerCost(){
int bagPrice = 1800;
System.out.prinln("Bag Price is:" + bagPrice);
return bagPrice;
}
void showCategory(String bagType){
System.out.prinln("Bag Type is:" + bagType);
int returnedValue = computeCost();
System.out.prinln("Returned Bag Price:" + returnedValue);
}
void displayBagInfo(){
System.out.prinln("Backpack details");
showCategory("Travel Bag");
}
}