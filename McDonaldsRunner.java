class McDonaldsRunner {
    public static void main(String[] args) {

        int price = McDonalds.checkItem("Pizza");
        System.out.println("Price for one item: " + price);

        int totalPrice = McDonalds.checkItem("Pizza", price, 5);
        System.out.println("Total Price: " + totalPrice);
    }
}