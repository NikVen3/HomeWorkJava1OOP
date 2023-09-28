package HomeWork;

public class Chocolate extends Product{
    private double volume;
    private double calories;

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getCalories() {
        return this.calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Chocolate(String brand, String name, double price, double volume, double Calories) {
        super(brand, name, price);
        this.volume = volume;
        this.calories = Calories;
    }

    public String displayInfo() {
        return String.format("[Шоколад] %s - %s - %.2f - Граммы: %.2f; Колорийность: %d", this.brand, this.name, this.price, this.volume, this.calories);
    }
}


