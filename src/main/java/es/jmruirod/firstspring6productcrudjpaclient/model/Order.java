package es.jmruirod.firstspring6productcrudjpaclient.model;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * Esta clase representa un objeto Order (pedido) que se almacena en la base de datos.
 * Cada pedido tiene un identificador único, un producto asociado, unidades, total y fecha.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
@Entity
@Table(name = "orders")
public class Order 
{
    /**
     * Identificador único del pedido.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    /**
     * Identificador del producto asociado a este pedido.
     */
    private int productId;

    /**
     * Cantidad de unidades pedidas.
     */
    private int units;

    /**
     * Total del pedido.
     */
    private double total;

    /**
     * Fecha y hora en que se realizó el pedido.
     */
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime date;
    
    /**
     * Constructor por defecto de la clase Order.
     */
    public Order() 
    {

    }

    /**
     * Constructor de la clase Order con parámetros.
     *
     * @param productId Identificador del producto asociado al pedido.
     * @param units Cantidad de unidades pedidas.
     * @param total Total del pedido.
     * @param date Fecha y hora en que se realizó el pedido.
     */
    public Order(int productId, int units, double total, LocalDateTime date) 
    {
        this.productId = productId;
        this.units = units;
        this.total = total;
        this.date = date;
    }

    /**
     * Constructor de la clase Order con parámetros.
     *
     * @param id Identificador único del pedido.
     * @param productId Identificador del producto asociado al pedido.
     * @param units Cantidad de unidades pedidas.
     * @param total Total del pedido.
     * @param date Fecha y hora en que se realizó el pedido.
     */
    public Order(int id, int productId, int units, double total, LocalDateTime date) 
    {
        this.id = id;
        this.productId = productId;
        this.units = units;
        this.total = total;
        this.date = date;
    }

    /**
     * Obtiene el identificador único del pedido.
     *
     * @return El identificador único del pedido.
     */
    public int getId() 
    {
        return id;
    }

    /**
     * Establece el identificador único del pedido.
     *
     * @param id El identificador único del pedido.
     */
    public void setId(int id) 
    {
        this.id = id;
    }

    /**
     * Obtiene el identificador del producto asociado al pedido.
     *
     * @return El identificador del producto asociado al pedido.
     */
    public int getProductId() 
    {
        return productId;
    }

    /**
     * Establece el identificador del producto asociado al pedido.
     *
     * @param productId El identificador del producto asociado al pedido.
     */
    public void setProductId(int productId) 
    {
        this.productId = productId;
    }

    /**
     * Obtiene la cantidad de unidades pedidas.
     *
     * @return La cantidad de unidades pedidas.
     */
    public int getUnits() 
    {
        return units;
    }

    /**
     * Establece la cantidad de unidades pedidas.
     *
     * @param units La cantidad de unidades pedidas.
     */
    public void setUnits(int units) 
    {
        this.units = units;
    }

    /**
     * Obtiene el total del pedido.
     *
     * @return El total del pedido.
     */
    public double getTotal() 
    {
        return total;
    }

    /**
     * Establece el total del pedido.
     *
     * @param total El total del pedido.
     */
    public void setTotal(double total) 
    {
        this.total = total;
    }

    /**
     * Obtiene la fecha y hora en que se realizó el pedido.
     *
     * @return La fecha y hora en que se realizó el pedido.
     */
    public LocalDateTime getDate() 
    {
        return date;
    }

    /**
     * Establece la fecha y hora en que se realizó el pedido.
     *
     * @param date La fecha y hora en que se realizó el pedido.
     */
    public void setDate(LocalDateTime date) 
    {
        this.date = date;
    }

    /**
     * Devuelve una representación en cadena de texto del objeto Order.
     *
     * @return Una cadena de texto que representa el objeto Order.
     */
    @Override
    public String toString() 
    {
        return "Order [id=" + id + ", productId=" + productId + ", units=" + units + ", total=" + total + ", date="
                + date + "]";
    }

    /**
     * Calcula el valor hash del objeto Order basado en su identificador único.
     *
     * @return El valor hash del objeto Order.
     */
    @Override
    public int hashCode() 
    {
        return Objects.hashCode(id);
    }

    /**
     * Compara el objeto Order con otro objeto para determinar si son iguales.
     *
     * @param obj El objeto con el que se va a comparar.
     * @return true si los objetos son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Order other = (Order) obj;

        if (id != other.id)
            return false;

        if (productId != other.productId)
            return false;

        if (units != other.units)
            return false;

        if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
            return false;

        if (date == null) 
        {
            if (other.date != null)
                return false;
        } 
        else if (!date.equals(other.date))
            return false;

        return true;
    }      
}
