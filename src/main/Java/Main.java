import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>(
                Arrays.asList(
                        new Product("Snickers", 60.0),
                        new Product("Twix", 40.0)
                )
        );

        VendingMachine vendingMachine = new VendingMachine(list);
        String key = "Twix";
        System.out.println(vendingMachine.getProductByName(key));

        List<Product> listBottle = new ArrayList<Product>(
                Arrays.asList(
                        new Bottle("Coca-Cola", 50.0, 0.5),
                        new Bottle("Sprite", 55.0, 0.5)
                )
        );

        VendingMachine bottleMachine = new BottleVendingMachine(listBottle);
        String keyBottle = "Sprite";
        System.out.println(bottleMachine.getProductByName(keyBottle));

    }
}
