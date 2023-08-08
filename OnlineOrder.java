import java.util.ArrayList;

public class OnlineOrder {
    private Member member;
    private double costOrder;
    private int numItems;
    private ArrayList<GroceryItem> basketItems;

    public OnlineOrder(Member member, ArrayList<GroceryItem> basketItems){
        this.member = member;
        this.costOrder = totalCostBasket(basketItems);
        this.numItems = basketItems.size();
        this.basketItems = new ArrayList<>(basketItems);
    }

    public void setMember(Member m){
        this.member = m;
    }
    public Member getMember(){
        return member;
    }
    public void setCostOrder(double co){
        this.costOrder = co;
    }
    public double getCostOrder(){
        return costOrder;
    }
    public void setNumItems(int ni){
        this.numItems = ni;
    }
    public int getNumItems(){
        return numItems;
    }
    public void setBasketItems(ArrayList<GroceryItem> bi){
        this.basketItems = bi;
    }
    public ArrayList<GroceryItem> getBasketItems(){
        return basketItems;
    }

    public double totalCostBasket(ArrayList<GroceryItem> basket) {
        double totalCost = 0.0;
        for (GroceryItem item : basket) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }

    public void checkInventory() throws BadGrocery {
        for (GroceryItem item : basketItems) {
            if (item.getInventory() <= 0) {
                throw new BadGrocery(item.getItemName() + " is out of stock.");
            }
        }
    }

    public String toString(){
        return ("\nMember: " + member.getName() +
        "\nCost of Order: " + getCostOrder() +
        "\nNumber of Items: " + getNumItems() +
        "\nBasket Items: \n" + getBasketItems());
    }

    public String compareTo(OnlineOrder other){
        if (this.costOrder > other.costOrder){
            return (this.member + " has a higher cost: " + this.costOrder);
        } else if (this.costOrder < other.costOrder) {
            return (other.member + " has a higher cost: " + other.costOrder);
        } else {
            return ("Both members have the same cost: " + this.costOrder);
        }
    }
}
