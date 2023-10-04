package es.jmruirod.firstspring6productcrudjpaclient.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.jmruirod.firstspring6productcrudjpaclient.model.Order;
import es.jmruirod.firstspring6productcrudjpaclient.model.Product;
import es.jmruirod.firstspring6productcrudjpaclient.service.OrderServiceInterface;
import es.jmruirod.firstspring6productcrudjpaclient.service.ProductServiceInterface;

@RestController
public class OrderController 
{
    @Autowired
    private OrderServiceInterface orderService;

    @Autowired
    private ProductServiceInterface productService;

    @PostMapping(value = "order/{id}/{units}")
    public ResponseEntity<?> create(@PathVariable int id, @PathVariable int units)
    {
        Product product = this.productService.findById(id);
        Order order = null;

        if (product == null) 
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encuentra el producto.");          
        }

        if (units > product.getStock())
        {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No hay stock suficiente.");
        }

        order = new Order();
        order.setProductId(id);
        order.setUnits(units);
        order.setTotal(units * this.productService.getPrice(id));
        order.setDate(LocalDateTime.now());

        this.orderService.create(order);
        this.productService.updateStock(id, product.getStock() - units);

        return ResponseEntity.ok("Pedido realizado con éxito.");
    }

    @GetMapping(value = "orders", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Order> getAll() 
    {
        return this.orderService.getAll();
    }    
}
