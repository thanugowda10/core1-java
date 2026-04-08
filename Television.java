class Television{
int getAmount(){
int tvCost = 45000;
System.out.println("TV Cost is :" + tvCost);
return tvCost;
}
void showBrand(String brandName){
System.out.println("Brand Name is:" + brandName);
int receivedCost = getAmount();
System.out.println("Returned TV Cost:" + receivedCost);
}
void displayTVInfo(){
System.out.println("Television details");
showBrand("Sony");
}
}