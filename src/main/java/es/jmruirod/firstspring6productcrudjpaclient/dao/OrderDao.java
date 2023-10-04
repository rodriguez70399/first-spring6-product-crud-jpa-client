package es.jmruirod.firstspring6productcrudjpaclient.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.jmruirod.firstspring6productcrudjpaclient.model.Order;

public interface OrderDao extends JpaRepository<Order, Integer> 
{
    
}