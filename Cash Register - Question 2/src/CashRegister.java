public class CashRegister
{
    //private Display display = new Display();
    //private TicketPrinter ticketPrinter = new TicketPrinter();
    private View view; // instead of using Display and TicketPrinter objects, use a reference to View interface
    private Product currentProduct;
    private ProductDB productDB = new ProductDB();
    private int UPCCode;

    public void setCurrentProductUPC(int UPCCode)
    {
        this.UPCCode = UPCCode;
        this.currentProduct = this.getCurrentProductInfo();

        // Only print on the views if the product is defined
        if (this.currentProduct != null)
        {
            // Displays the current scanned item
            //this.display.displayText(this.currentProduct.toString());
            //this.ticketPrinter.displayText(this.currentProduct.toString());

            // set view to point to Display object to call displayProduct of Display class
            view = new Display();
            view.displayProduct(currentProduct);

            // set view to TicketPrinter object to call displayProduct of TicketPrinter class
            view = new TicketPrinter();
            view.displayProduct(currentProduct);
        }
    }

    public Product getCurrentProductInfo()
    {
        currentProduct = this.productDB.GetProductInfo(this.UPCCode);
        return currentProduct;
    }
}