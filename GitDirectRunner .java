class GitDirectRunner {
    public static void main(String[] args) {

        int price = GitDirect.checkItem("Pizza");
        System.out.println("Price for one item: " + price);

        int totalPrice = GitDirect.checkItem("Pizza", price, 5);
        System.out.println("Total Price: " + totalPrice);
    }
}