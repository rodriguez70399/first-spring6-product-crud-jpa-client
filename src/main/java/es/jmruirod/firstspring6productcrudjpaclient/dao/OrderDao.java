package es.jmruirod.firstspring6productcrudjpaclient.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.jmruirod.firstspring6productcrudjpaclient.model.Order;

/**
 * Esta interfaz define un repositorio de datos para la entidad Order. Extiende JpaRepository
 * para obtener automáticamente métodos CRUD básicos y consultas relacionadas con la entidad.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public interface OrderDao extends JpaRepository<Order, Integer> 
{
    
}