/**
 Keyboard
 */

public class Keyboard
{
    private CashRegister cashRegister = new CashRegister();

    /**
     Stores the UPC code entered by cashier
     */

    public void setUPCCode(int UPCCode){
        this.cashRegister.setCurrentProductUPC(UPCCode);
    }
}