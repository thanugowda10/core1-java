class Book{
int getPages(){
int totalPages = 300;
System.out.println("TotalPages:" + totalPages);
return totalPages;
}
void displayAuthor(String AuthorName){
System.out.println("Author:" + authorName):
int pages = getPages();
System.out.println("Returned Pages:" + pages);
}
void showBookDetails(){
System.out.println("Book details");
displayAuthor("R.K. Narayan");
}
}