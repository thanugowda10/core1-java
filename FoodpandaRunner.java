class FoodpandaRunner {
    public static void main(String[] args) {

        int price = Foodpanda.checkItem("Pizza");
        System.out.println("Price for one item: " + price);

        int totalPrice = Foodpanda.checkItem("Pizza", price, 5);
        System.out.println("Total Price: " + totalPrice);
    }
}