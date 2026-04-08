class Footwear{
int findPrice(){
int shoeCost = 2500;
System.out.println("Shoes Cost is:" + shoeCost);
return shoeCost;
}
void displayType(String shoeType){
System.out.println("Shoe Type is:" + shoeType);
int totalCost = findPrice();
System.out.println("Returned Shoe Cost:" + tatalCost);
}
void showShoeDetails(){
System.out.println("Footwear details");
displayType("Sports Shoes");
}
}