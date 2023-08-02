package FunctionalPracticalExc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Rice", 30.5, "Groceries", 50));
        products.add(new Product("Milk", 20.0, "Groceries", 0));
        products.add(new Product("Laptop", 1500.0, "Electronics", 10));
        products.add(new Product("TV", 800.0, "Electronics", 5));
        products.add(new Product("Table", 120.0, "Furniture", 15));

        List<Product> filteredByStockProducts = products.stream()
                .filter(product -> product.getStock()>0 && product.getCost()<50)
                .collect(Collectors.toList());

        System.out.println(filteredByStockProducts);

        List<Product> filteredByCategoryProducts = products.stream()
                .filter(product -> product.getCategory().equals("Groceries"))
                .collect(Collectors.toList());

        System.out.println(filteredByCategoryProducts);

        System.out.println(products.stream()
                .mapToDouble(Product::getTotalCost)
                .sum());

    }
}
