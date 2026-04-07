class JustEatRunner {
    public static void main(String[] args) {

        int price = JustEat.checkItem("Pizza");
        System.out.println("Price for one item: " + price);

        int totalPrice = JustEat.checkItem("Pizza", price, 5);
        System.out.println("Total Price: " + totalPrice);
    }
}