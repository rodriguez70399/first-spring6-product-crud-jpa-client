package es.jmruirod.firstspring6productcrudjpaclient.model;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Order 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int productId;
    private int units;
    private double total;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime date;
    
    public Order() 
    {

    }

    public Order(int productId, int units, double total, LocalDateTime date) 
    {
        this.productId = productId;
        this.units = units;
        this.total = total;
        this.date = date;
    }

    public Order(int id, int productId, int units, double total, LocalDateTime date) 
    {
        this.id = id;
        this.productId = productId;
        this.units = units;
        this.total = total;
        this.date = date;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public int getProductId() 
    {
        return productId;
    }

    public void setProductId(int productId) 
    {
        this.productId = productId;
    }

    public int getUnits() 
    {
        return units;
    }

    public void setUnits(int units) 
    {
        this.units = units;
    }

    public double getTotal() 
    {
        return total;
    }

    public void setTotal(double total) 
    {
        this.total = total;
    }

    public LocalDateTime getDate() 
    {
        return date;
    }

    public void setDate(LocalDateTime date) 
    {
        this.date = date;
    }

    @Override
    public String toString() 
    {
        return "Order [id=" + id + ", productId=" + productId + ", units=" + units + ", total=" + total + ", date="
                + date + "]";
    }

    @Override
    public int hashCode() 
    {
        return Objects.hashCode(id);
    }

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
