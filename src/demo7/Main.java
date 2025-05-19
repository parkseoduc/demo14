package demo7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList();
        // them san pham vao danh sach
        products.add(new Product("Apple", "Apple", 100.0));
        products.add(new Product("Banana", "Banana", 200.0));
        products.add(new Product("Pear", "Pear", 300.0));
        products.add(new Product("Grape", "Grape", 400.0));
        products.add(new Product("Pineapple", "Pineapple", 500.0));

        //
        for (Product p : products) {
            System.out.println(p.getInfo());
            System.out.println("Discounted Price: " + p.calculateDiscountedPrice());
            System.out.println("-------------------------");
        }

    }
}
