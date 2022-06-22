package com.example.webapplication.entity.product;

public enum Category {
    //Vegetables and Fruits
    VEGETABLES("Vegetables"),
    FRUITS("Fruit"),
    GREENS("Greens"),
    DRIED_FRUITS("Dried_fruits"),
    //Beverages
    JUICES("Juices"),
    WATER("Water"),
    CARBONATED_DRINKS("Carbonated_drinks"),
    COLD_DRINKS("Cold_drinks"),
    ENERGETIC_DRINKS("Energetic_drinks"),
    //Milk and dairy products
    MILK("Milk"),
    YOGURT("Yogurt"),
    SOUR_CREAM("Sour_cream"),
    QUARK("Quark"),
    CHEESE_CURDS("Cheese_curds"),
    BUTTER("Butter"),
    CHEESE("Cheese"),
    SULUGUNI("Suluguni"),
    BRYNZA("Brynza"),
    EGGS("Eggs"),
    //Meat and meat products
    BEEF("Beef"),
    LAMB("Lamb"),
    POULTRY_MEAT("Poultry_meat"),
    RABBIT_MEAT("Poultry_meat"),
    FISH("Fish"),
    FISH_PRODUCTS("Fish_products"),
    SAUSAGE_PRODUCTS("Sausage_products"),
    SAUSAGE("Sausage"),
    DELI_MEAT("Deli_meat"),
    //Grocery
    CEREALS("Cereals"),
    FLOUR("Flour"),
    SUGAR("Sugar"),
    SALT("Salt"),
    NOODLE("Noodle"),
    VEGETABLE_OIL("Vegetable_oil"),
    HONEY("Honey"),
    CONFITURE("Confiture"),
    MARGARINE("Margarine"),
    BREAKFAST("Breakfast"),
    SAUCES("Sauces"),
    SPICES("Spices"),
    SEASONINGS("Seasonings"),
    //Tea and Coffe
    BLACK_TEA("Black_tea"),
    GREEN_TEA("Green_tea"),
    COFFEE("Coffee"),
    CREAM("Cream"),
    //Bakery products
    FRESH_BAKERY("Fresh_bakery"),
    LOAVES("Loaves"),
    CRACKERS("Crackers"),
    //Cakes and sweets
    CAKES("Cakes"),
    PASTRY("Pastry"),
    GINGERBREAD("Gingerbread"),
    DIABETIC_PRODUCTS("Diabetic_products"),
    CHOCOLATE("Chocolate"),

    SALADS("Salads"),
    SANDWICHES("Sandwiches"),

    CANNED_FISH("Canned_fish"),
    CANNED_MEAT("Canned_meat"),
    CANNED_FRUITS("Canned_fruits"),
    CANNED_VEGETABLES("Canned_vegetables");

    private final String name;

    Category(String category) {
        this.name = category;
    }

    public String getName() {
        return name;
    }
    }