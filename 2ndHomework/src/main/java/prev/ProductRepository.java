package prev;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    List<Product> productList = new ArrayList<>();
    public ProductRepository(){

        productList.add(    new Product(1, "Banana", 1));
                productList.add (  new Product(2, "Book", 14));
                        productList.add(new Product(3, "Board_game", 35));
                                productList.add(new Product(4, "Coffee_cup", 3));
                                        productList.add(new Product(5, "Magic_keyboard", 50));
                                                productList.add(new Product(6, "Mouse", 20));
                                                        productList.add(new Product(7, "Headphones", 70));
                                                                productList.add(new Product(8, "PC", 1350));
                                                                        productList.add(new Product(9, "Soda", 2));
                                                                                productList.add(new Product(10, "Water_gun", 17)
        );
    }

    public Product findById(int id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public List<Product> findAll() {
        return productList;
    }

    @Override
    public String toString() {
        return "ProductRepository{" +
                "productList=" + productList +
                '}';
    }
}
