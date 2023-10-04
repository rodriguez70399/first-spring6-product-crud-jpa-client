package es.jmruirod.firstspring6productcrudjpaclient.service;

import java.util.List;

import es.jmruirod.firstspring6productcrudjpaclient.model.Order;

public interface OrderServiceInterface 
{
    public void create(Order order);
    public List<Order> getAll();    
}
