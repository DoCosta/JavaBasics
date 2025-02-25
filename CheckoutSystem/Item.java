public class Item
{
    private String item;
    private Category category;
    private double price;
    
    public Item(String item, Category category, double price){
        this.item = item;
        this.category = category;
        this.price = price;
    }
    
    public String getItem(){
        return item;
    }
    public Category getCategory(){
        return category;
    }
    public double getPrice(){
        return price;
    }
}
