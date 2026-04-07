class KFCRunner {
    public static void main(String[] args) {

        int price = KFC.checkItem("Pizza");
        System.out.println("Price for one item: " + price);

        int totalPrice = KFC.checkItem("Pizza", price, 5);
        System.out.println("Total Price: " + totalPrice);
    }
}