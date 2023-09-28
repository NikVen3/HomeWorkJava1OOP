package HomeWork;

public class BottleOfMilk extends Product {
    private double volume;
    private int fat;

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getFat() {
        return this.fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public BottleOfMilk(String brand, String name, double price, double volume, int fat) {
        super(brand, name, price);
        this.volume = volume;
        this.fat = fat;
    }

    public String displayInfo() {
        return String.format("[МОЛОКО] %s - %s - %.2f - объем: %.2f; жирность: %d", this.brand, this.name, this.price, this.volume, this.fat);
    }
}
