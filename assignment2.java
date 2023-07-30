/*
CISC-124 2023 Summer
Name: Kylie Hubbard
Student Number: 20294570
Email: kylie.hubbard@queensu.ca
Date: 2023-08-01
I confirm that this assignment solution is my own work and conforms to Queen’s
standards of Academic Integrity.


This project exercises the use of inheritance and object-oriented programming. I have created a software
that is able to create and store various businesses, as well as the ability to retrieve that data.
*/

import java.util.ArrayList;


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

class CommerceCompanyTest{
    public static void main(String[] args){


        //REMOVE COMMENTS ON CODE TO SEE TESTS


        //toString tests:
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
