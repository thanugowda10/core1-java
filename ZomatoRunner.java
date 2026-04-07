class ZomatoRunner {
    public static void main(String[] args) {

        int price = Zomato.checkItem("Pizza");
        System.out.println("Price for one item: " + price);

        int totalPrice = Zomato.checkItem("Pizza", price, 5);
        System.out.println("Total Price: " + totalPrice);
    }
}