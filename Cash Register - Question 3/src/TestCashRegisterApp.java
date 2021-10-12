public class TestCashRegisterApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner();

        //getting cashRegister object from scanner class
        CashRegister cashRegister = scanner.scannedUPCCode(7117195);

        //using received cashRegister object to invoice keyboard parameterized constructor
        Keyboard keyboard = new Keyboard(cashRegister);
        //Now it will solve the NullPointerException
        keyboard.setUpcCode(7117195);
    }
}