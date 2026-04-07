class DominosRunner {
    public static void main(String[] args) {

        int price = Dominos.checkItem("Pizza");
        System.out.println("Price for one item: " + price);

        int totalPrice = Dominos.checkItem("Pizza", price, 5);
        System.out.println("Total Price: " + totalPrice);
    }
}