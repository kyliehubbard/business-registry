import java.util.Arrays;

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
