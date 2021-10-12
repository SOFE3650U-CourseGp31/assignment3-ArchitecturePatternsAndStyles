public class TicketPrinter implements View
{
    public void displayText(String text) {
        System.out.println("-------------Ticket Printer-------------");
        System.out.println(text);
    }

    // override the displayProduct method of View interface to display the product details using toString method of Product class
    @Override
    public void displayProduct(Product p) {
        System.out.println("-------------Ticket Printer-------------");
        System.out.println(p);

    }
}