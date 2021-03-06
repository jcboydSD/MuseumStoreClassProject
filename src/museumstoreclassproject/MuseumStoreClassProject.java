package museumstoreclassproject;

/******************************************************************************
 * MuseumStoreClassProject.java 
 * Programmer: @author jcboyd
 * Version: 1.0
 * Course: SDEV 2210
 *
 * This program simulates sales at a museum store
 *****************************************************************************/

public class MuseumStoreClassProject {

    public static void main(String[] args) {

        //stock inventory
        MuseumStore item1 = new MuseumStore("hoodie", "clothing", 10.5, 10);
        MuseumStore item2 = new MuseumStore("t-shirt", "clothing", 7.5, 25);
        MuseumStore item3 = new MuseumStore("bouncy ball", "toy", 2.5, 50);
        MuseumStore item4 = new MuseumStore("dinosaur", "toy", 3.5, 25);
        MuseumStore item5 = new MuseumStore("pencil", "tool", 0.75, 100);
        MuseumStore item6 = new MuseumStore("eraser", "tool", 1.25, 100);

        //display all inventory
        System.out.println("Ch 7 Museum Store Items by JC Boyd\n");
        item1.display();
        item2.display();
        item3.display();
        item4.display();
        item5.display();
        item6.display();
        System.out.println("\nSales");
        
        //sell items
        item1.sell(2);
        item3.sell(15);
        item4.sell(50);
        
    } //end main
    
} //end class MuseumStoreClassProject
