class Student{
int getMarks(){
int marks = 85;
System.out.println("Marks: " + marks);
return marks;
}
void displayName(String studentName){
System.out.println("Student Name:" + studentName);
int m = getMarks();
System.out.println("Returned Marks:" + m);
}
void showStudentDetails(){
System.out.println("Student details");
displayName("Rahul");
}
}