/**
Creates a Product object
 */

public class Product
{
    private int UPCCode;
    private String name;
    private double price;

    /**
     Sets the UPC code, name and price for current scanned product
     */

    public Product(int UPCCode, String name, double price)
    {
        this.UPCCode = UPCCode;
        this.name = name;
        this.price = price;
    }

    /**
     * Sets the UPC code for the scanned product
     */

    public void setUPCCode(int UPCCode)
    {
        this.UPCCode = UPCCode;
    }

    /**
     * Returns the UPC code for the scanned product
     */

    public int getUPCCode()
    {
        return UPCCode;
    }

    /**
     Represents the Product object info as a string
     */

    @Override
    public String toString() {
        return "Product (" +
                "UPCCode: " + UPCCode +
                ", Name:" + name +
                ", Price: " + price + ')';
    }
}