public class BronzeMember extends Member{
    private double gasPurchases;
    private double groceryPurchases;
    private double everydayPurchases;

    public BronzeMember(String name, int age, int yearsMember, String phone, boolean goodStanding, int memberID,
    int monthJoined, int yearJoined, double dues, double gasPurchases, double groceryPurchases,
    double everydayPurchases){
        super(name, age, yearsMember, phone, goodStanding, memberID, monthJoined, yearJoined, dues);
        this.gasPurchases = gasPurchases;
        this.groceryPurchases = groceryPurchases;
        this.everydayPurchases = everydayPurchases;
    }

    public void setGasPurchases(double gp){
        this.gasPurchases = gp;
    }
    public double getGasPurchases(){
        return gasPurchases;
    }
    public void setGroceryPurchases(double grop){
        this.groceryPurchases = grop;
    }
    public double getGroceryPurchases(){
        return groceryPurchases;
    }
    public void setEverydayPurchases(double evep){
        this.everydayPurchases = evep;
    }
    public double getEverydayPurchases(){
        return everydayPurchases;
    }

    double calculateCashBack(){
        double cb = (gasPurchases * 0.02) + (groceryPurchases * 0.01) + (everydayPurchases * 0.05);
        return cb;
    }

    double calculateDues(){
        double cd = 50.0;
        return cd;
    }

    public String toString(){
        return ("\nName: " + getName() +
        "\nAge: " + getAge() +
        "\nYears of Membership: " + getYearsMember() +
        "\nPhone: " + getPhone() +
        "\nGood Standing: " + getGoodStanding() +
        "\nMember ID: " + getMemberID() +
        "\nMonth Joined: " + getMonthJoined() +
        "\nYear Joined: " + getYearJoined() +
        "\nDues: " + getDues() +
        "\nGas Purchases: " + getGasPurchases() +
        "\nGrocery Purchases: " + getGroceryPurchases() +
        "\nEveryday Purchases: " + getEverydayPurchases());
    }
}
