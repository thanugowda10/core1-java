class Employee{
double grtSalary(){
double salaryAmount = 50000.0;
System.out.println("Salary:" + salaryAmount);
return salaryAmount;
}
void displayEmployeeName(String empName){
System.out.println("Employee Name:" + empName);
double sal = getSalary();
System.out.println("Returned Salary:" + sal);
}
void showEmplyeeDetails(){
System.out.println("Employee Details");
displayEmployeeName("Anjali");
}
}