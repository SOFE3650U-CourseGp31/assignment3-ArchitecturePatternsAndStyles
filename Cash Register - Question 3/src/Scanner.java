public class Scanner
{
    private final CashRegister cashRegister = new CashRegister();

    //Updating return type
    public CashRegister scannedUPCCode(int UPCCode) {
        this.cashRegister.setCurrentProductUPC(UPCCode);

        //Returning this cashregister to use it in TestCashRegisterAppclass
        return this.cashRegister;
    }
}