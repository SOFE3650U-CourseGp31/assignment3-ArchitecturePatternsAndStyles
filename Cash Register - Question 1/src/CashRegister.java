public class CashRegister {
    private Display display = new Display();
    private TicketPrinter ticketPrinter = new TicketPrinter();
    private Product currentProduct;
    private ProductDB productDB = new ProductDB();
    private int UPCCode;

    /**
     * Set the UPC code for the scanned product
     */

    public void setCurrentProductUPC(int UPCCode)
    {
        this.UPCCode = UPCCode;
        this.currentProduct = this.getCurrentProductInfo();

// Only print on the views if the product is defined

        if (this.currentProduct != null)
        {

// Displays the current scanned item
            this.display.displayText(this.currentProduct.toString());
            this.ticketPrinter.displayText(this.currentProduct.toString());
        }
    }

    /**
     * Gets the product information and returns it
     */

    public Product getCurrentProductInfo() {
        currentProduct = this.productDB.GetProductInfo(this.UPCCode);
        return currentProduct;
    }
}