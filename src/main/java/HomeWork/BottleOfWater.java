package HomeWork;

public class BottleOfWater extends Product {
    private double volume;

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public BottleOfWater(String brand, String name, double price, double volume) {
        super(brand, name, price);
        this.volume = volume;
    }

    public String displayInfo() {
        return String.format("[ВОДА] %s - %s - %.2f - объем: %.2f", this.brand, this.name, this.price, this.volume);
    }
}
