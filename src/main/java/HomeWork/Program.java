package HomeWork;

import java.util.ArrayList;

public class Program {
    public Program() {
    }

    public static void main(String[] args) {
        Product product1 = new Product("ООО Источник", "_", -200.0);
        product1.setPrice(-10.0);
        product1.setName("");
        System.out.println(product1.displayInfo());
        Product product2 = new Product();
        System.out.println(product2.displayInfo());
        Product product3 = new Product("Бутылка с водой (3)", 150.0);
        System.out.println(product3.displayInfo());
        Product bottleOfWater = new BottleOfWater("ООО Источник", "Бутылка с водой (4)", 250.0, 1.5);
        System.out.println(bottleOfWater.displayInfo());
        Product bottleOfMilk1 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (1)", 310.0, 0.5, 15);
        System.out.println(bottleOfMilk1.displayInfo());
        Product bottleOfMilk2 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (2)", 330.0, 1.5, 15);
        System.out.println(bottleOfMilk2.displayInfo());
        Product bottleOfMilk3 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (3)", 340.0, 2.5, 35);
        System.out.println(bottleOfMilk3.displayInfo());
        Product bottleOfMilk4 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (4)", 350.0, 1.5, 25);
        System.out.println(bottleOfMilk4.displayInfo());


        ArrayList<Product> products = new ArrayList();
        products.add(bottleOfWater);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(bottleOfMilk4);
        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfMilk bottleOfMilk = vendingMachine.getBottleofMilk(1.5, 15);
        if (bottleOfMilk == null) {
            System.out.println("Такой бутылки с молоком нет в автомате.");
        } else {
            System.out.println("Вы купили:");
            System.out.println(bottleOfMilk.displayInfo());
        }
    }
}
//        Product chocolate = new Chocolate("Нестле", "Белый шоколад", "300", "350", "195");
//        System.out.println(chocolate.displayInfo());
//        Product chocolate1 = new Chocolate("Нестле", "Темный шоколад", "330", "330", "175");
//        System.out.println(chocolate.displayInfo());
//        Product chocolate2 = new Chocolate("Нестле", "Горький шоколад", "270", "320", "185");
//        System.out.println(chocolate.displayInfo());
//        Product chocolate3 = new Chocolate("Нестле", "Молочный шоколад", "250", "300", "155");
//        System.out.println(chocolate.displayInfo());
//        Product chocolate4 = new Chocolate("Нестле", "Пористый шоколад", "200", "270", "135");
//        System.out.println(chocolate.displayInfo());
//
//


//        ArrayList<Product> products1 = new ArrayList();
//        products.add(chocolate);
//        products.add(chocolate1);
//        products.add(chocolate2);
//        products.add(chocolate3);
//        products.add(chocolate4);
//        VendingMachine vendingMachine1 = new VendingMachine(products);
//        Chocolate chocolate = vendingMachine.getсhocolate(320, 185);
//        if (chocolate == null) {
//            System.out.println("Такого шоколада нет в автомате.");
//        } else {
//            System.out.println("Вы купили:");
//            System.out.println(chocolate.displayInfo());
//        }
//    }
//}
