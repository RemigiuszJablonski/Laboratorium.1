import java.sql.SQLOutput;
import java.util.*;

public class main {
    public static void main(String[] args) {
        List<products> product = new ArrayList<>();
        product.add(new products("Cola", 4.50F));
        product.add(new products("Potatoes", 2.00F));
        product.add(new products("Corn", 1.00F));
        product.add(new products("Pizza", 30.99F));
        product.add(new products("Almonds", 15.99F));

        System.out.println("Sorted products by name by Comparable\n");
        Collections.sort(product);
        for(products productss : product){
            System.out.println(productss);
        }

        System.out.println("\nSorted products by cost by Comparator\n");
        product.sort(new Comparator<products>() {
            @Override
            public int compare(products a, products b) {
                return Double.compare(a.getCost(), b.getCost()); // Porównanie cen
            }
        });
        for (products productss : product) {
            System.out.println(productss);
        }
        }
    }

