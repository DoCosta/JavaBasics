enum Category
{
    CATEGORY_FOOD("Food"),
    CATEGORY_ALCOHOL("Alcohol"),
    CATEGORY_NON_FOOD("Non-Food"), 
    CATEGORY_JOURNALS("Journals");
    
    private String categoryName;
    
    private Category(String c){
        this.categoryName = c;
    }
    
    public String getName(){
        return this.categoryName;
    }
}
