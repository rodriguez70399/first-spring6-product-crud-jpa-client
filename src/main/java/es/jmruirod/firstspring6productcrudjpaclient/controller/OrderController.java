package es.jmruirod.firstspring6productcrudjpaclient.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.jmruirod.firstspring6productcrudjpaclient.model.Order;
import es.jmruirod.firstspring6productcrudjpaclient.model.Product;
import es.jmruirod.firstspring6productcrudjpaclient.model.TemporalOrder;
import es.jmruirod.firstspring6productcrudjpaclient.service.OrderServiceInterface;
import es.jmruirod.firstspring6productcrudjpaclient.service.ProductServiceInterface;

@RestController
public class OrderController 
{
    @Autowired
    private OrderServiceInterface orderService;

    @Autowired
    private ProductServiceInterface productService;

    @PostMapping(value = "order", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> create(@RequestBody TemporalOrder temporalOrder)
    {
        int productId = temporalOrder.getProductId();
        int units = temporalOrder.getUnits();
        Product product = this.productService.findById(productId);
        Order order = null;

        if (product == null) 
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encuentra el producto.");          
        }

        if (temporalOrder.getUnits() > product.getStock())
        {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No hay stock suficiente.");
        }

        order = new Order();
        order.setProductId(productId);
        order.setUnits(units);
        order.setTotal(units * this.productService.getPrice(productId));
        order.setDate(LocalDateTime.now());

        this.orderService.create(order);
        this.productService.updateStock(productId, product.getStock() - units);

        return ResponseEntity.ok("Pedido realizado con éxito.");
    }

    @GetMapping(value = "orders", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Order> getAll() 
    {
        return this.orderService.getAll();
    }    
}
