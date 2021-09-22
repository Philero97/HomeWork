package ru.gb.prev;

import org.springframework.stereotype.Repository;
import ru.gb.prev.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class OrderRepository {
    private List<Order> orders = new ArrayList<>();


    public OrderRepository() {
        orders.add(new Order(1, LocalDate.now(), 888.77f, Collections.emptyList()));

    }

    public Optional<Order> findById(int id) {
        return orders.stream().filter(o -> o.getId() == id).findFirst();
    }

    public List<Order> findAll() {
        return orders;
    }

    public void add(Order order) {
        this.orders.add(order);
    }


    @Override
    public String toString() {
        return "ProductRepository{" +
                "products=" + orders +
                '}';
    }

}