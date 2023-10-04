package es.jmruirod.firstspring6productcrudjpaclient.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import es.jmruirod.firstspring6productcrudjpaclient.model.Product;

/**
 * Implementación de la interfaz {@link ProductServiceInterface} que proporciona servicios para la gestión de productos.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
@Service
public class ProductServiceInterfaceImplemented implements ProductServiceInterface
{
    @Autowired
    private RestTemplate template;

    private String url = "http://localhost:8080/";

    /**
     * Obtiene un producto identificado por su ID.
     * 
     * @param id El ID del producto a buscar.
     * @return El producto buscado.
     */
    public Product findById(int id)
    {
        return this.template.getForObject(url + "product/" + id, Product.class);
    }

    /**
     * Obtiene una lista de todos los productos disponibles.
     * 
     * @return Lista de productos.
     */
    @Override
    public List<Product> getAll() 
    {
        return Arrays.asList(template.getForObject(url + "products", Product[].class));
    }

    /**
     * Actualiza el stock de un producto identificado por su ID.
     * 
     * @param id    El ID del producto a actualizar.
     * @param stock La cantidad de stock a establecer.
     */
    @Override
    public void updateStock(int id, int stock) 
    {
        this.template.put(url + "product/" + id + "?stock=" + stock, null);
    }

    /**
     * Obtiene el precio de un producto identificado por su ID.
     * 
     * @param id El ID del producto del que se desea obtener el precio.
     * @return El precio del producto. Si no se encuentra el producto, se devuelve -1.
     */
    @Override
    public double getPrice(int id) 
    {
        return this.template.getForObject( url + "product/price/" + id, Double.class);
    }
}