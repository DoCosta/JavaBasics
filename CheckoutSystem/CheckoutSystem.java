import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/**
 * The class checkout system can collect bought items on a receipt, print the current receipt. Furthermore, the system can analyze all sold items based on category. 
 *
 * @author Anonymous Intern
 * @version 1.0
 */
public class CheckoutSystem
{
    private ArrayList<Receipt> allReceipts;
    
    private Receipt currentReceipt;
    
    /**
     * Constructor initializing the checkout system
     */
    public CheckoutSystem() {
        this.allReceipts = new ArrayList<>();
        this.currentReceipt = new Receipt();
    }
    
    /**
     * This method enables adding a new entry to the recept consisting of item description,
     * category and price. 
     * 
     * @param item - item description
     * @param category - category of added item
     * @param price - price of item
     */
    public void addItemToReceipt(String item, Category category, double price) {
        this.currentReceipt.items.add(new Item(item, category, price));
    }
    
    public void printReceipt() {
        this.currentReceipt.printReceipt();
        allReceipts.add(this.currentReceipt);
        this.currentReceipt = new Receipt();
    }
    
    public void printSellingStatistics() {
        HashSet<Item> soldArticles = new HashSet<>();
        for (Receipt r : allReceipts) {
            soldArticles.addAll(r.items);
        }
        System.out.println("Sold Items");
        for (Item s : soldArticles) {
            System.out.println(s.getItem());
        }
        
        System.out.println("\n\nNumber of sold items per category and income per category");        
        
        for(Category c : Category.values()){
            int counter = 0;
            double cPrice = 0.0;
            for(Receipt r : allReceipts) {
                for(Item it : r.items){
                    if(it.getCategory().equals(c)){
                        counter++;
                        cPrice += it.getPrice();
                    }
                }
            }
            System.out.println("Items of category "+ c.getName() +" were sold " 
                    + counter + " times for " 
                    + cPrice + " CHF");
        }
    }   
}
