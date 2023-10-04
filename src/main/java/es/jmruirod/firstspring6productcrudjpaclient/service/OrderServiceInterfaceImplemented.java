package es.jmruirod.firstspring6productcrudjpaclient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jmruirod.firstspring6productcrudjpaclient.dao.OrderDao;
import es.jmruirod.firstspring6productcrudjpaclient.model.Order;

@Service
public class OrderServiceInterfaceImplemented implements OrderServiceInterface
{
    @Autowired
    private OrderDao orderDao;

    @Override
    public void create(Order order) 
    {
        this.orderDao.save(order);           
    }

    @Override
    public List<Order> getAll() 
    {
        return this.orderDao.findAll();
    }
}
