import java.util.ArrayList;
/**
 * The receipt class respresents the printout of checkout details on a piece of paper.
 * The sold articles are collected and printed out nicely formatted. 
 *
 *
 * @author Anonymous Intern
 * @version 1.0
 */
public class Receipt
{
    
    public ArrayList<Item> items;
    /**
     * The constructor initialized the receipt with an empty item list
     */
    public Receipt() {
        this.items = new ArrayList<>();
    }
    
    /**
     * Print of company name and all sold articles. The length of item description will be analyzed 
     * to print the price at the same position (in x direction). The sum of all items is calculated
     * and printed. 
     */
    public void printReceipt() {
        double sum = 0;
        System.out.println("Shopping Paradise");
        System.out.println("Receipt");
        int maxWidthOfItemDescription = 32;
        for (int i = 0; i < this.items.size(); i++) {
            String row = this.items.get(i).getItem();
            int numSpaces = maxWidthOfItemDescription - this.items.get(i).getItem().length();
            for (int j = 0; j < numSpaces; j++) {
                row += " ";
            }
            row += this.items.get(i).getPrice();
            System.out.println(row);
            sum +=  this.items.get(i).getPrice();;
        }
        String row = "TOTAL:";
        int numSpaces = maxWidthOfItemDescription - "TOTAL:".length();
        for (int j = 0; j < numSpaces; j++) {
            row += " ";
        }
        row += sum;
        System.out.println(row);
        System.out.println("Thank you for shopping with us\n\n\n");
    }
}
