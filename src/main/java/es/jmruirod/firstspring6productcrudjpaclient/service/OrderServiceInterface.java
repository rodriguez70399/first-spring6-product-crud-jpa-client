package es.jmruirod.firstspring6productcrudjpaclient.service;

import java.util.List;

import es.jmruirod.firstspring6productcrudjpaclient.model.Order;

/**
 * Esta interfaz define los métodos que deben ser implementados por cualquier servicio
 * que gestione órdenes (pedidos).
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public interface OrderServiceInterface 
{
    /**
     * Crea una nueva orden (pedido).
     *
     * @param order La orden que se va a crear.
     */
    public void create(Order order);

    /**
     * Recupera una lista de todas las órdenes (pedidos) almacenadas.
     *
     * @return Una lista de objetos Order que representa todas las órdenes almacenadas.
     */
    public List<Order> getAll();    
}