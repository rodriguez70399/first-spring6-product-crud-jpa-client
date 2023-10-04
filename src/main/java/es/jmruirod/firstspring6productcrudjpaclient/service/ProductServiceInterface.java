package es.jmruirod.firstspring6productcrudjpaclient.service;

import java.util.List;

import es.jmruirod.firstspring6productcrudjpaclient.model.Product;

/**
 * Interfaz que define los métodos de servicio para la gestión de productos.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public interface ProductServiceInterface 
{
    /**
     * Obtiene un producto identificado por su ID.
     * 
     * @param id El ID del producto a buscar,
     * @return El producto buscado.
     */
    public Product findById(int id);

    /**
     * Obtiene una lista de todos los productos disponibles.
     * 
     * @return Lista de productos.
     */
    public List<Product> getAll();

    /**
     * Actualiza el stock de un producto identificado por su ID.
     * 
     * @param id    El ID del producto a actualizar.
     * @param stock La cantidad de stock a establecer.
     */
    public void updateStock(int id, int stock);

    /**
     * Obtiene el precio de un producto identificado por su ID.
     * 
     * @param id El ID del producto del que se desea obtener el precio.
     * @return El precio del producto.
     */
    public double getPrice(int id);
}
