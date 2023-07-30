/*
CISC-124 2023 Summer
Name: Kylie Hubbard
Student Number: 20294570
Email: kylie.hubbard@queensu.ca
Date: 2023-07-26
I confirm that this assignment solution is my own work and conforms to Queen’s
standards of Academic Integrity.

This project exercises the use of inheritance and object-oriented programming. I have created a software
that is able to create and store various businesses, as well as the ability to retrieve that data.
*/

import java.util.ArrayList;
import java.util.Arrays;

class Business {
    private int registrationNumber;
    private FranchiseOwner owner;
    private int year;
    private double dailySales;
    private double annualSales;

    public int getRegistrationNumber(){
        return registrationNumber;
    }
    public void setRegistrationNumber(int r){
        this.registrationNumber = r;
    }
    public FranchiseOwner getFranchiseOwner(){
        return owner;
    }
    public void setFranchiseOwner(FranchiseOwner o){
        this.owner = o;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int y){
        this.year = y;
    }
    public double getDailySales(){
        return dailySales;
    }
    public void setDailySales(double s) throws IllegalBusiness{
        if (dailySales <= 0){
            throw new IllegalBusiness("Invalid daily sales: " + dailySales + "Daily sales must be greater than 0.");
        }
        this.dailySales = s;
    }
    public double getAnnualSales(){
        return annualSales;
    }
    public void setAnnualSales(double a) throws IllegalBusiness{
        if(annualSales <= 0){
            throw new IllegalBusiness("Invalid annual sales: " + annualSales + "Annual sales must be greater than 0.");
        }
        this.annualSales = a;
    }

    public Business(int registrationNumber, FranchiseOwner owner, int year, double dailySales, double annualSales) {
        this.registrationNumber = registrationNumber;
        this.owner = owner;
        this.year = year;
        this.dailySales = dailySales;
        this.annualSales = annualSales;
    }

    public String toString(){
        return "Registration Number: " + registrationNumber + "\nOwner: " + owner + "\nYear: " + year
        + "\nDaily Sales: " + dailySales + "\nAnnual Sales: " + annualSales;
    }
}

class Restaurant extends Business {
    private boolean driveThru;
    private boolean mobileOrdering;
    private String[] lisMeals;
    private int rating;
    private int numSeats;

    public boolean getDriveThru(){
        return driveThru;
    }
    public void setDriveThru(boolean dt){
        this.driveThru = dt;
    }
    public boolean getMobileOrdering(){
        return mobileOrdering;
    }
    public void setMobileOrdering(boolean mo){
        this.mobileOrdering = mo;
    }
    public String[] setLisMeals(){
        return lisMeals;
    }
    public void setLisMeals(String[] m){
        this.lisMeals = m;
    }
    public int getRating(){
        return rating;
    }
    public void setRating(int r) throws IllegalBusiness{
        if (rating < 1 || rating > 5){
            throw new IllegalBusiness("Invalid rating: " + rating + "Rating must be between 1 and 5.");
        }
        this.rating = r;
    }
    public int getNumSeats(){
        return numSeats;
    }
    public void setNumSeats(int s) throws IllegalBusiness{
        if (numSeats < 1){
            throw new IllegalBusiness("Invalid number of seats: " + numSeats + "Number of seats must be at least 1.");
        }
        this.numSeats = s;
    }

    public Restaurant(int registrationNumber, FranchiseOwner owner, int year, double dailySales, double annualSales,
    boolean driveThru, boolean mobileOrdering, String[] lisMeals, int rating, int numSeats){
        super(registrationNumber,owner,year,dailySales,annualSales);
        this.driveThru = driveThru;
        this.mobileOrdering = mobileOrdering;
        this.lisMeals = lisMeals;
        this.rating = rating;
        this.numSeats = numSeats;
    }

    public String toString(){
        return super.toString() + "\nDrive Thru: " + driveThru + "\nMobile Order: " + mobileOrdering
        + "\nMeal List: " + Arrays.toString(lisMeals) + "\nRating: " + rating + "\nNumber of Seats: " + numSeats;
    }
}

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

class FranchiseOwner {
    private String name;
    private int age;
    private int businessYears;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a) throws IllegalBusiness{
        if (age < 18){
            throw new IllegalBusiness("Invalid age: " + age + "Age must be 18 or above.");
        }
        this.age = a;
    }
    public int getBusinessYears(){
        return businessYears;
    }
    public void setBusinessYears(int b) throws IllegalBusiness{
        if (businessYears > 110){
            throw new IllegalBusiness("Invalid years of business: " + businessYears + "Years of business must be less than 110.");
        }
        this.businessYears = b;
    }

    public FranchiseOwner(String name, int age, int businessYears){
        this.name = name;
        this.age = age;
        this.businessYears = businessYears;
    }

    public String toString(){
        return "\nName: " + name + "\nAge: " + age + "\nBusiness Years: " + businessYears;
    }
}

class Registry {
    private ArrayList<Business> businessCollection;
    
    public Registry(){
        businessCollection = new ArrayList<>();
    }

    public void addBusiness(Business business){
        businessCollection.add(business);
    }
    public void printRegistry(){
        System.out.println(businessCollection.toString());
    }
    public double averageDailySales(){
        double totalDaily = 0.0;
        for (Business business : businessCollection){
            totalDaily += business.getDailySales();
        } 
        return totalDaily/businessCollection.size();
    }
    public double averageYearlySales(){
        double totalYearly = 0.0;
        for(Business business : businessCollection){
            totalYearly += business.getAnnualSales();
        }
        return totalYearly/businessCollection.size();
    }

}

class IllegalBusiness extends RuntimeException {
    public IllegalBusiness(String message){
        super(message);
    }
}


class CommerceCompanyTest{
    public static void main(String[] args){

        //REMOVE COMMENTS ON CODE TO SEE TESTS

        FranchiseOwner firstOwner = new FranchiseOwner("Dean", 40, 17);
        //System.out.println(firstOwner.toString());
        FranchiseOwner secondOwner = new FranchiseOwner("Shauna", 32, 5);
        //System.out.println(secondOwner.toString());
        FranchiseOwner thirdOwner = new FranchiseOwner("Madison", 42, 21);
        //System.out.println(thirdOwner.toString());

        Restaurant firstRestaurant = new Restaurant(12345, firstOwner, 
        2006, 50000, 18250000, false, false, 
        new String[]{"Steak", "Risotto", "Sushi"}, 5, 30);
        //System.out.println(firstRestaurant.toString());

        Supermarket firstSupermarket = new Supermarket(24680, secondOwner, 2015, 
        15000, 5475000, 50, 110, new String[]{"Seafood", "Deli", "Produce"});
        //System.out.println(firstSupermarket.toString());

        TravelPlaza firstTravelPlaza = new TravelPlaza(36912, thirdOwner, 2002, 
        25000, 9125000, new String[]{"Greek", "Japanese", "Mexican"}, 
        new String[]{"Men's Fashion", "Women's Fashion", "Pet Store"}, true);
        //System.out.println(firstTravelPlaza.toString());
        
        Registry officialRegistry = new Registry();
        officialRegistry.addBusiness(firstRestaurant);
        officialRegistry.addBusiness(firstSupermarket);
        officialRegistry.addBusiness(firstTravelPlaza);
        //officialRegistry.printRegistry();

        //System.out.println(officialRegistry.averageDailySales());
        //System.out.println(officialRegistry.averageYearlySales());
    }
}
