class Zomato {

    static int checkItem(String foodItem) {
        int price = 0;

        if ("Biryani".equals(foodItem)) {
            price = 250;
        } else if ("Fried Rice".equals(foodItem)) {
            price = 90;
        } else if ("Chicken Kebab".equals(foodItem)) {
            price = 110;
        } else if ("Pizza".equals(foodItem)) {
            price = 200;
        } else if ("Burger".equals(foodItem)) {
            price = 80;
        } else if ("Pasta".equals(foodItem)) {
            price = 150;
        } else if ("Noodles".equals(foodItem)) {
            price = 100;
        } else if ("Sandwich".equals(foodItem)) {
            price = 70;
        } else if ("Momos".equals(foodItem)) {
            price = 120;
        } else if ("Roll".equals(foodItem)) {
            price = 90;
        } else if ("Dosa".equals(foodItem)) {
            price = 60;
        } else if ("Idli".equals(foodItem)) {
            price = 50;
        } else if ("Meals".equals(foodItem)) {
            price = 180;
        } else if ("Ice Cream".equals(foodItem)) {
            price = 40;
        } else if ("Juice".equals(foodItem)) {
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

        if ("Biryani".equals(foodItem)) {
            totalPrice = price * quantity;
        } else if ("Fried Rice".equals(foodItem)) {
            totalPrice = price * quantity;
        } else if ("Chicken Kebab".equals(foodItem)) {
            totalPrice = price * quantity;
        } else if ("Pizza".equals(foodItem)) {
            totalPrice = price * quantity;
        } else if ("Burger".equals(foodItem)) {
            totalPrice = price * quantity;
        } else if ("Pasta".equals(foodItem)) {
            totalPrice = price * quantity;
        } else if ("Noodles".equals(foodItem)) {
            totalPrice = price * quantity;
        } else if ("Sandwich".equals(foodItem)) {
            totalPrice = price * quantity;
        } else if ("Momos".equals(foodItem)) {
            totalPrice = price * quantity;
        } else if ("Roll".equals(foodItem)) {
            totalPrice = price * quantity;
        } else if ("Dosa".equals(foodItem)) {
            totalPrice = price * quantity;
        } else if ("Idli".equals(foodItem)) {
            totalPrice = price * quantity;
        } else if ("Meals".equals(foodItem)) {
            totalPrice = price * quantity;
        } else if ("Ice Cream".equals(foodItem)) {
            totalPrice = price * quantity;
        } else if ("Juice".equals(foodItem)) {
            totalPrice = price * quantity;
        } else {
            return 0;
        }

        return totalPrice;
    }
}