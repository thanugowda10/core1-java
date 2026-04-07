class BazaarNow {

    static int checkItem(String foodItem) {
        int price = 0;

        if ("Biryani"==foodItem) {
            price = 250;
        } else if ("Fried Rice"==foodItem) {
            price = 90;
        } else if ("Chicken Kebab"==foodItem) {
            price = 110;
        } else if ("Pizza"==foodItem) {
            price = 200;
        } else if ("Burger"==foodItem) {
            price = 80;
        } else if ("Pasta"==foodItem) {
            price = 150;
        } else if ("Noodles"==foodItem) {
            price = 100;
        } else if ("Sandwich"==foodItem) {
            price = 70;
        } else if ("Momos"==foodItem) {
            price = 120;
        } else if ("Roll"==foodItem) {
            price = 90;
        } else if ("Dosa"==foodItem) {
            price = 60;
        } else if ("Idli"==foodItem) {
            price = 50;
        } else if ("Meals"==foodItem) {
            price = 180;
        } else if ("Ice Cream"==foodItem) {
            price = 40;
        } else if ("Juice"==foodItem) {
            price = 30;
        } else {
            System.out.println("Item not found");
            return 0;
        }

        System.out.println("Food Item: " + foodItem);
        System.out.println("Price: " + price);
        return price;
    }

    static int checkItem(String foodItem, int price, int quantity) {
        int totalPrice = 0;

        if ("Biryani"==foodItem) {
            totalPrice = price * quantity;
        } else if ("Fried Rice"==foodItem) {
            totalPrice = price * quantity;
        } else if ("Chicken Kebab"==foodItem) {
            totalPrice = price * quantity;
        } else if ("Pizza"==foodItem) {
            totalPrice = price * quantity;
        } else if ("Burger"==foodItem) {
            totalPrice = price * quantity;
        } else if ("Pasta"==foodItem) {
            totalPrice = price * quantity;
        } else if ("Noodles"==foodItem) {
            totalPrice = price * quantity;
        } else if ("Sandwich"==foodItem) {
            totalPrice = price * quantity;
        } else if ("Momos"==foodItem) {
            totalPrice = price * quantity;
        } else if ("Roll"==foodItem) {
            totalPrice = price * quantity;
        } else if ("Dosa"==foodItem) {
            totalPrice = price * quantity;
        } else if ("Idli"==foodItem) {
            totalPrice = price * quantity;
        } else if ("Meals"==foodItem) {
            totalPrice = price * quantity;
        } else if ("Ice Cream"==foodItem) {
            totalPrice = price * quantity;
        } else if ("Juice"==foodItem) {
            totalPrice = price * quantity;
        } else {
            return 0;
        }

        return totalPrice;
    }
}
