public class Display implements View
{
    public void displayText(String text)
    {
        System.out.println("-------------Display--------------------");
        System.out.println(text);
    }

    // override the displayProduct method of View interface to display the product using toString method of Product class
    @Override
    public void displayProduct(Product p)
    {
        System.out.println(" ");
        System.out.println("-------------Display-------------");
        System.out.println(p);
        System.out.println("\n");
    }
}