class Swiggy {
    public static double getswiggyMenunName(String foodName) {
        double swiggyfoodPrice = 0.0;
        System.out.println("getswiggyMenunName started");
        if (foodName.equals("Biryani")) {
            swiggyfoodPrice = 100.87;
            return swiggyfoodPrice;
        } else if (foodName.equals("Pizza")) {
            swiggyfoodPrice = 103.89;
            return swiggyfoodPrice;
        } else if (foodName.equals("Chicken Wings")) {
            swiggyfoodPrice = 69.09;
            return swiggyfoodPrice;
        } else if (foodName.equals("Samosas")) {
            swiggyfoodPrice = 99.09;
            return swiggyfoodPrice;
        } else if (foodName.equals("Dosa")) {
            swiggyfoodPrice = 67.98;
            return swiggyfoodPrice;
        } else if (foodName.equals("Idli")) {
            swiggyfoodPrice = 57.45;
            return swiggyfoodPrice;
        } else if (foodName.equals("Veg Momos")) {
            swiggyfoodPrice = 89.98;
            return swiggyfoodPrice;
        } else if (foodName.equals("Chole Bhature")) {
            swiggyfoodPrice = 49.09;
            return swiggyfoodPrice;
        } else if (foodName.equals("Pav Bhaji")) {
            swiggyfoodPrice = 989.78;
            return swiggyfoodPrice;
        } else if (foodName.equals("Rajma Chawal")) {
            swiggyfoodPrice = 777.98;
            return swiggyfoodPrice;
        } else if (foodName.equals("Dal Makhani")) {
            swiggyfoodPrice = 345.45;
            return swiggyfoodPrice;
        } else if (foodName.equals("Garlic Naan")) {
            swiggyfoodPrice = 147.56;
            return swiggyfoodPrice;
        } else if (foodName.equals("Palak Paneer")) {
            swiggyfoodPrice = 399.34;
            return swiggyfoodPrice;
        } else if (foodName.equals("Butter Chicken")) {
            swiggyfoodPrice = 299.00;
            return swiggyfoodPrice;
        } else if (foodName.equals("Chicken Tikka Masala")) {
            swiggyfoodPrice = 199.0;
            return swiggyfoodPrice;
        } else if (foodName.equals("Sizzlers")) {
            swiggyfoodPrice = 107.89;
            return swiggyfoodPrice;
        } else if (foodName.equals("Fried Rice")) {
            swiggyfoodPrice = 107.89;
            return swiggyfoodPrice;
        } else if (foodName.equals("Tacos")) {
            swiggyfoodPrice = 107.89;
            return swiggyfoodPrice;
        } else if (foodName.equals("Onion Dosa")) {
            swiggyfoodPrice = 107.89;
            return swiggyfoodPrice;
        } else if (foodName.equals("IdliVada")) {
            swiggyfoodPrice = 107.89;
            return swiggyfoodPrice;
        } else {
            System.out.println(foodName + " Not found");
        }
        System.out.println("getswiggyMenunName Ended");
        return swiggyfoodPrice;
    }
}
