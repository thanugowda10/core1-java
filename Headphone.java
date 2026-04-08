calss Headphone{
int obtainCost = 3000;
System.out.println("Amount is:" + amount);
return amount;
}
void printType(String type){
System.out.println("Type is:" + type);
int finalAmount = obtainCost();
System.out.println("Returned Amount:" + finalAmount);
}
void showSpecs(){
Syste.out.println("Headphones details");
printType("Wireless");
}
}