package HomeWork;




public class Product {
    protected String name;
    protected String brand;
    protected double price;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.checkName(name);
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.checkBrand(brand);
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.checkPrice(price);
    }

    public Product() {
        this("<Product>");
    }

    public Product(String name) {
        this(name, 100.0);
    }

    public Product(String name, double price) {
        this("<Brand>", name, price);
    }

    public Product(String brand, String name, double price) {
        this.checkBrand(brand);
        this.checkName(name);
        this.checkPrice(price);
    }

    private void checkBrand(String brand) {
        if (brand != null && brand.length() >= 3) {
            this.brand = brand;
        } else {
            this.brand = "<Brand>";
        }

    }

    private void checkName(String name) {
        if (name != null && name.length() >= 3) {
            this.name = name;
        } else {
            this.name = "<Product>";
        }

    }

    private void checkPrice(double price) {
        if (price < 100.0) {
            this.price = 100.0;
        } else {
            this.price = price;
        }

    }

    public String displayInfo() {
        return String.format("%s - %s - %.2f", this.brand, this.name, this.price);
    }
}
