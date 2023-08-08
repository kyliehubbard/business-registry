public class GroceryItem {
    private String itemName;
    private double price; // must be over 0
    private int inventory; 
    private int SKU;
    private GroceryCategory itemCategory;

    public GroceryItem(String itemName, double price, int inventory, int SKU, GroceryCategory itemCategory){
        this.itemName = itemName;
        this.price = price;
        this.inventory = inventory;
        this.SKU = SKU;
        this.itemCategory = itemCategory;
    }

    public void setItemName (String item){
        this.itemName = item;
    }
    public String getItemName(){
        return itemName;
    }
    public void setPrice(double p) throws BadGrocery{
        if (price > 0){
            this.price = p;
        } else {
            throw new BadGrocery("Price must be a value above 0");
        }
    }
    public double getPrice(){
        return price;
    }
    public void setInventory (int i){
        this.inventory = i;
    }
    public int getInventory(){
        return inventory;
    }
    public void setSKU (int skew){
        this.SKU = skew;
    }
    public int getSKU(){
        return SKU;
    }
    public void setItemCategory (GroceryCategory c){
        this.itemCategory = c;
    }
    public GroceryCategory getItemCategory(){
        return itemCategory;
    }

    public String toString(){
        return ("\nItem Name: " + getItemName() +
        "\nPrice: " + getPrice() +
        "\nInventory: " + getInventory() +
        "\nSKU: " + getSKU() +
        "\nItem Category: " + getItemCategory());
    }
}
