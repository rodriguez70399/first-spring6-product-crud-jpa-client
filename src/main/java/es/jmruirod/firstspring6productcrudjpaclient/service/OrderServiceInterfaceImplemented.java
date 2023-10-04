package es.jmruirod.firstspring6productcrudjpaclient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jmruirod.firstspring6productcrudjpaclient.dao.OrderDao;
import es.jmruirod.firstspring6productcrudjpaclient.model.Order;

/**
 * Esta clase implementa la interfaz OrderServiceInterface y proporciona una implementación
 * concreta de los métodos definidos en dicha interfaz para gestionar órdenes (pedidos).
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
@Service
public class OrderServiceInterfaceImplemented implements OrderServiceInterface
{
    @Autowired
    private OrderDao orderDao;

    /**
     * Crea una nueva orden (pedido).
     *
     * @param order La orden que se va a crear.
     */
    @Override
    public void create(Order order) 
    {
        this.orderDao.save(order);           
    }

    /**
     * Recupera una lista de todas las órdenes (pedidos) almacenadas.
     *
     * @return Una lista de objetos Order que representa todas las órdenes almacenadas.
     */
    @Override
    public List<Order> getAll() 
    {
        return this.orderDao.findAll();
    }
}