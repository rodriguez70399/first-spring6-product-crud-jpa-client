package es.jmruirod.firstspring6productcrudjpaclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.jmruirod.firstspring6productcrudjpaclient.model.Product;
import es.jmruirod.firstspring6productcrudjpaclient.service.ProductServiceInterface;

/**
 * Controlador que gestiona las solicitudes relacionadas con los productos.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
@RestController
public class ProductController 
{
    @Autowired
    private ProductServiceInterface service;

    /**
     * Obtiene una lista de todos los productos.
     * 
     * @return Lista de objetos Product representando los productos.
     * @apiNote GET: localhost:PUERTO/products
     */
    @GetMapping(value = "products", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getAll()
    {
        return this.service.getAll();
    }
}
