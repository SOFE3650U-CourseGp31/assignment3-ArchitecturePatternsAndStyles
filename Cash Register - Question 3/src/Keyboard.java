public class Keyboard {

    private final CashRegister cashRegister; // Model

    public Keyboard(CashRegister cashRegister ) {
        this.cashRegister = cashRegister;
    }

    public Keyboard() {
        this.cashRegister = null;
    }

    public void setUpcCode(long upcCode) {
        cashRegister.setCurrentProductUPC(upcCode);
    }
}