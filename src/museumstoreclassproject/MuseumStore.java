package museumstoreclassproject;

/******************************************************************************
 * MuseumStore.java 
 * Programmer: @author jcboyd
 *
 * Class associated with MuseumStoreClassProject.java
 *****************************************************************************/

public class MuseumStore 
{
    private String item, category; //instance variables
    private double price; //instance variable
    private int quantity; //instance variable
    
    //*************************************************************************    
    
    public MuseumStore(String item, String category, double price, int quantity)
    {
        this.item = item;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    } //end MuseumStore constructor
 
    //*************************************************************************    
    
    public void sell(int quantity)
    {
        System.out.printf("\nSell %d of %s\n", quantity, this.item);
        if (quantity <= this.quantity) //check inventory for adequate amount
        {
            System.out.printf("Sold %d %s, cost $%.2f\n", 
                quantity, this.item, this.price * quantity);
            this.quantity -= quantity;
        } 
        else
        {
            System.out.printf("No sale, not enough %s in stock\n", this.item);
        }            
        this.display();
    } //end sell
    
    //*************************************************************************
    
    public void display()
    {
        System.out.printf("Item: %s, category %s, price = $%.2f, quantity = %d\n",
                this.item, this.category, this.price, this.quantity);
    } //end display
    
} //end class MuseumStore
