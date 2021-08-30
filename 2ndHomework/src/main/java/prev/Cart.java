package prev;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private ProductRepository repository;
    private List<Product> products;

    public Cart(ProductRepository pr) {
        this.repository = pr;
        this.products = new ArrayList<>();
    }

    public boolean addToCart(int id) {
        if (repository.findById(id) != null) {
            products.add(repository.findById(id));
            return true;
        }
        return false;
    }

    public boolean removeFromCart(int id) {
        return products.removeIf(p -> p.getId() == id);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "pr=" + repository +
                ", cartProducts=" + products +
                '}';
    }
}
