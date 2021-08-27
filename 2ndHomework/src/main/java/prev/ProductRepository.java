package prev;

import java.util.List;
import java.util.Optional;

public class ProductRepository {
    private List<Product> products;
    public ProductRepository(){
        this.products = List.of(
        new Product(1, "Banana", 1),
        new Product(2, "Book", 14),
        new Product(3, "Board_game", 35),
        new Product(4, "Coffee_cup", 3),
        new Product(5, "Magic_keyboard", 50),
        new Product(6, "Mouse", 20),
        new Product(7, "Headphones", 70),
        new Product(8, "PC", 1350),
        new Product(9, "Soda", 2),
        new Product(10, "Wather_gun", 17)
        );
    }

    public Optional<Product> findById(final int id){
      return products.stream().filter(p -> p.getId() ==id).findFirst();
    }
    public List<Product> findAll(){
        return products;
    }

    @Override
    public String toString(){
        return "ProductRepository{" +
                "products=" + products +
                '}';
    }


}
