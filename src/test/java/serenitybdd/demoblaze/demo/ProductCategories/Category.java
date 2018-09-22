package serenitybdd.demoblaze.demo.ProductCategories;

public enum Category {

    Phones("Phones"),
    Laptops("Laptops"),
    Monitors("Monitors");

    Category(String label) {
        this.label = label;
    }

    private final String label;

    public String label() {
        return label;
    }


   // public static final String Mobile = "HTC" ;
}
