class EatSureRunner {
    public static void main(String[] args) {

        int price = EatSure.checkItem("Pizza");
        System.out.println("Price for one item: " + price);

        int totalPrice = EatSure.checkItem("Pizza", price, 5);
        System.out.println("Total Price: " + totalPrice);
    }
}