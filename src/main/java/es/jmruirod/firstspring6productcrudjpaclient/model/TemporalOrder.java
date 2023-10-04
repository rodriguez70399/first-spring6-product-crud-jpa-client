package es.jmruirod.firstspring6productcrudjpaclient.model;

/**
 * Esta clase representa un objeto TemporalOrder (pedido temporal) que contiene información
 * sobre un producto y la cantidad de unidades asociadas a él. Esta clase se utiliza para
 * gestionar pedidos temporales antes de crear un pedido definitivo en la base de datos.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public class TemporalOrder 
{
    /**
     * Identificador del producto asociado al pedido temporal.
     */
    private int productId;
    
    /**
     * Cantidad de unidades en el pedido temporal.
     */
    private int units;
    
    /**
     * Constructor por defecto de la clase TemporalOrder.
     */
    public TemporalOrder() 
    {

    }

    /**
     * Constructor de la clase TemporalOrder con parámetros.
     *
     * @param productId Identificador del producto asociado al pedido temporal.
     * @param units Cantidad de unidades en el pedido temporal.
     */
    public TemporalOrder(int productId, int units) 
    {
        this.productId = productId;
        this.units = units;
    }

    /**
     * Obtiene el identificador del producto asociado al pedido temporal.
     *
     * @return El identificador del producto asociado al pedido temporal.
     */
    public int getProductId() 
    {
        return productId;
    }

    /**
     * Establece el identificador del producto asociado al pedido temporal.
     *
     * @param productId El identificador del producto asociado al pedido temporal.
     */
    public void setProductId(int productId) 
    {
        this.productId = productId;
    }

    /**
     * Obtiene la cantidad de unidades en el pedido temporal.
     *
     * @return La cantidad de unidades en el pedido temporal.
     */
    public int getUnits() 
    {
        return units;
    }

    /**
     * Establece la cantidad de unidades en el pedido temporal.
     *
     * @param units La cantidad de unidades en el pedido temporal.
     */
    public void setUnits(int units) 
    {
        this.units = units;
    }    
}