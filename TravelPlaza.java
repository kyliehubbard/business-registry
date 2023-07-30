import java.util.Arrays;

class TravelPlaza extends Business {
    private String[] diningOptions;
    private String[] shoppingOptions;
    private boolean fuel;

    public String[] getDiningOptions(){
        return diningOptions;
    }
    public void setDiningOptions(String[] o){
        this.diningOptions = o;
    }
    public String[] getShoppingOptions(){
        return shoppingOptions;
    }
    public void setShoppingOptions(String[] so){
        this.shoppingOptions = so;
    }
    public boolean getFuel(){
        return fuel;
    }
    public void setFuel(boolean f){
        this.fuel = f;
    }

    public TravelPlaza(int registrationNumber, FranchiseOwner owner, int year, double dailySales, double annualSales,
    String[] diningOptions, String[] shoppingOptions, boolean fuel){
        super(registrationNumber, owner,year,dailySales,annualSales);
        this.diningOptions = diningOptions;
        this.shoppingOptions = shoppingOptions;
        this.fuel = fuel;
    }

    public String toString(){
        return super.toString() + "\nDining Options: " + Arrays.toString(diningOptions) + "\nShopping Options: "
        + Arrays.toString(shoppingOptions) + "\nFuel: " + fuel;
    }
}
