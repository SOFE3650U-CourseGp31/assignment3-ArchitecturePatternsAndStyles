import java.util.ArrayList;
import java.util.List;


public class TicketPrinter extends Observer {
    List obs = new ArrayList<>();
    double discount;

    public TicketPrinter() {
    }

    @Override
    public void onNotify(double discount, String text) {
        this.discount = discount;
        System.out.println("discount of " + this.discount + "% was applied");
        System.out.println("Printing the Product");
        System.out.println(text);
    }


    public void displayText(String text) {
        System.out.println("Printing the Product");
        System.out.println(text);
    }
}