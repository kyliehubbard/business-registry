import java.util.Arrays;

class Supermarket extends Business {
    private int numProducts;
    private double loyaltyUsers;
    private String[] lisDepartments;

    public int getNumProducts(){
        return numProducts;
    }
    public void setNumProducts(int p){
        this.numProducts = p;
    }
    public double getLoyaltyUsers(){
        return loyaltyUsers;
    }
    public void setLoyaltyUsers(double u){
        this.loyaltyUsers = u;
    }
    public String[] getLisDepartments(){
        return lisDepartments;
    }
    public void setLisDepartments(String[] d){
        this.lisDepartments = d;
    }

    public Supermarket(int registrationNumber, FranchiseOwner owner, int year, double dailySales, double annualSales,
    int numProducts, double loyaltyUsers, String[] lisDepartments){
        super(registrationNumber,owner,year,dailySales,annualSales);
        this.numProducts = numProducts;
        this.loyaltyUsers = loyaltyUsers;
        this.lisDepartments = lisDepartments;
    }

    public String toString(){
        return super.toString() + "\nNumber of Products: " + numProducts + "\nLoyalty Users: "
        + loyaltyUsers + "\nDepartment List: " + Arrays.toString(lisDepartments);
    }
}
