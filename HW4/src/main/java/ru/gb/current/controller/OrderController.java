package ru.gb.current.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.gb.prev.Order;
import ru.gb.prev.OrderRepository;

import java.util.List;


@Controller
@RequestMapping("/orders")
public class OrderController {

    private final OrderRepository repository;


    public OrderController(OrderRepository repository) {
        this.repository = repository;
    }


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Order> findAll() {
        return repository.findAll();
    }


    @GetMapping("/{id}")
    @ResponseBody
    public Order findById(@PathVariable int id){
        return repository.findById(id).isPresent() ? repository.findById(id).get() : null;
    }
    @RequestMapping(method = RequestMethod.POST)
    public List<Order> save(@RequestBody Order order) {
        repository.add(order);
        return repository.findAll();
    }
}