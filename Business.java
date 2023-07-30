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