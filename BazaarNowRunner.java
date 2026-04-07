class BazaarNowRunner {
    public static void main(String[] args) {

        int price = BazaarNow.checkItem("Pizza");
        System.out.println("Price for one item: " + price);

        int totalPrice = BazaarNow.checkItem("Pizza", price, 5);
        System.out.println("Total Price: " + totalPrice);
    }
}