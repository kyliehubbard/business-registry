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
        if (a < 18){
            throw new IllegalBusiness("Invalid age: " + a + "Age must be 18 or above.");
        }
        this.age = a;
    }
    public int getBusinessYears(){
        return businessYears;
    }
    public void setBusinessYears(int b) throws IllegalBusiness{
        if (b > 110){
            throw new IllegalBusiness("Invalid years of business: " + b + "Years of business must be less than or equal to 110.");
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