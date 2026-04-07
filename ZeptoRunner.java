class ZeptoRunner {
    public static void main(String[] args) {

        int price = Zepto.checkItem("Pizza");
        System.out.println("Price for one item: " + price);

        int totalPrice = Zepto.checkItem("Pizza", price, 5);
        System.out.println("Total Price: " + totalPrice);
    }
}