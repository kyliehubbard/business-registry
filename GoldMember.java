public class GoldMember extends Member{
    private double restaurantPurchases;
    private double travelPurchases;

    public GoldMember(String name, int age, int yearsMember, String phone, boolean goodStanding, int memberID,
    int monthJoined, int yearJoined, double dues, double restaurantPurchases, double travelPurchases){
        super(name, age, yearsMember, phone, goodStanding, memberID, monthJoined, yearJoined, dues);
        this.restaurantPurchases = restaurantPurchases;
        this.travelPurchases = travelPurchases;
    }

    public void setRestaurantPurchases(double resp){
        this.restaurantPurchases = resp;
    }
    public double getRestaurantPurchases(){
        return restaurantPurchases;
    }
    public void setTravelPurchases(double trap){
        this.travelPurchases = trap;
    }
    public double getTravelPurchases(){
        return travelPurchases;
    }

    double calculateCashBack(){
        double cb = (restaurantPurchases * 0.02) + (travelPurchases * 0.05);
        return cb;
    }

    double calculateDues(){
        double cd = 100.0;
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
        "\nRestaurant Purchases: " + getRestaurantPurchases() +
        "\nTravel Purchases: " + getTravelPurchases());
    }
}
