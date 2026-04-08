class Laptop{
double getWeight(){
double weight = 2.5;
System.out.println("Weight is:" +weight + "kg");
return weight;
}
void displayCompany(String company){
System.out.println("Company is:" + company);
double w = getWeight();
System.out.println("Returne dWeight:" + w +"kg");
}
void showLaptopDetails(){
System.out.println("Laptop details");
displaycompany("Dell");
}
}