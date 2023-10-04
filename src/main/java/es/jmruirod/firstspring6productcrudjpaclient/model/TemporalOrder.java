package es.jmruirod.firstspring6productcrudjpaclient.model;

public class TemporalOrder 
{
    private int productId;
    private int units;
    
    public TemporalOrder() 
    {

    }

    public TemporalOrder(int productId, int units) 
    {
        this.productId = productId;
        this.units = units;
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
}
