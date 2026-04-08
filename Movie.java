class Movie{
double getRating(){
double ratingValue = 4.5;
Systm.out.println("Rating:" + ratingValue);
return ratingValue;
}
void displayTitle(String movieTital){
Systm.out.println("Movie Tital:" + movieTital);
double r= getRating();
System.out.println("Returned Rating:" + r);
}
void showMovieDetails(){
System.out.println("movie Details");
displayTitle("KGF");
}
}}