public class PlatinumMember extends Member{
    private double entertainmentPurchases;
    private double recurringPurchases;
    private double transportationPurchases; 

    public PlatinumMember(String name, int age, int yearsMember, String phone, boolean goodStanding, int memberID,
    int monthJoined, int yearJoined, double dues, double entertainmentPurchases, double recurringPurchases,
    double transportationPurchases){
        super(name, age, yearsMember, phone, goodStanding, memberID, monthJoined, yearJoined, dues);
        this.entertainmentPurchases = entertainmentPurchases;
        this.recurringPurchases = recurringPurchases;
        this.transportationPurchases = transportationPurchases;
    }

    public void setEntertainmentPurchases(double ep){
        this.entertainmentPurchases = ep;
    }
    public double getEntertainmentPurchases(){
        return entertainmentPurchases;
    }
    public void setRecurringPurchases(double rp){
        this.recurringPurchases = rp;
    }
    public double getRecurringPurchases(){
        return recurringPurchases;
    }
    public void setTransportationPurchases(double tp){
        this.transportationPurchases = tp;
    }
    public double getTransportationPurchases(){
        return transportationPurchases;
    }

    double calculateCashBack(){
        double cb = (entertainmentPurchases * 0.02) + (recurringPurchases * 0.01) + (transportationPurchases * 0.05);
        return cb;
    }

    double calculateDues(){
        double cd = 150.0;
        double newDues;
        if (getYearsMember() > 10 && getGoodStanding() == true){
            newDues = cd * 0.8;
        } else{
            newDues = cd;
        }
        return newDues;
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
        "\nEntertainment Purchases: " + getEntertainmentPurchases() +
        "\nRecurring Purchases: " + getRecurringPurchases() +
        "\nTransportation Purchases: " + getTransportationPurchases());
    }
}
