package HomeWork;


import java.util.Iterator;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfMilk getBottleofMilk(double volume, int fat) {
        Iterator var4 = this.products.iterator();

        while (var4.hasNext()) {
            Product product = (Product) var4.next();
            if (product instanceof BottleOfMilk bottleOfMilk) {
                if (bottleOfMilk.getVolume() == volume && bottleOfMilk.getFat() == fat) {
                    return bottleOfMilk;
                }
            }
        }

        return null;
    }
}




