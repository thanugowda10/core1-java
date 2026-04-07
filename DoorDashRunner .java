class DoorDashRunner {
    public static void main(String[] args) {

        int price = DoorDash.checkItem("Pizza");
        System.out.println("Price for one item: " + price);

        int totalPrice = DoorDash.checkItem("Pizza", price, 5);
        System.out.println("Total Price: " + totalPrice);
    }
}