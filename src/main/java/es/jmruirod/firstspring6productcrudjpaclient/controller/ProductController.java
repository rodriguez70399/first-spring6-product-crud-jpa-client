package es.jmruirod.firstspring6productcrudjpaclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.jmruirod.firstspring6productcrudjpaclient.model.Product;
import es.jmruirod.firstspring6productcrudjpaclient.service.ProductServiceInterface;

@RestController
public class ProductController 
{
    @Autowired
    private ProductServiceInterface service;

    @GetMapping(value = "products", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getAll()
    {
        return this.service.getAll();
    }
}
