class Library {
int getBookCount() {
int numberOfBooks = 5000;
System.out.println("Number of Books: " + numberOfBooks);
return numberOfBooks;
}
void displayLibrarian(String librarianName) {
System.out.println("Librarian Name: " + librarianName);
int count = getBookCount();
System.out.println("Returned Book Count: " + count);
}
void showLibraryDetails() {
System.out.println("Library details")
displayLibrarian("Suresh");
}
}