abstract class Member {
    private String name;
    private int age;
    private int yearsMember;
    private String phone;
    private boolean goodStanding;
    private int memberID;
    private int monthJoined;
    private int yearJoined;
    private double dues;

    public Member(String name, int age, int yearsMember, String phone, boolean goodStanding, int memberID,
    int yearJoined, int monthJoined, double dues){
        this.name = name;
        this.age = age;
        this.yearsMember = yearsMember;
        this.phone = phone;
        this.goodStanding = goodStanding;
        this.memberID = memberID;
        this.monthJoined = monthJoined;
        this.yearJoined = yearJoined;
        this.dues = dues;
    }

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a) throws BadMember{
        if (age >= 18){
            this.age = a;
        } else{
            throw new BadMember("Age must be 18 or above.");
        }
    }
    public int getAge(){
        return age;
    }
    public void setYearsMember(int ym){
        this.yearsMember = ym;
    }
    public int getYearsMember(){
        return yearsMember;
    }
    public void setPhone(String p){
        this.phone = p;
    }
    public String getPhone(){
        return phone;
    }
    public void setGoodStanding(boolean gs){
        this.goodStanding = gs;
    }
    public boolean getGoodStanding(){
        return goodStanding;
    }
    public void setMemberID(int mi){
        this.memberID = mi;
    }
    public int getMemberID(){
        return memberID;
    }
    public void setMonthJoined(int mj) throws BadMember{
        if (monthJoined >= 12 && monthJoined <= 24){
            this.monthJoined = mj;
        } else {
            throw new BadMember("Month joined must be between 12-24.");
        }
    
    }
    public int getMonthJoined(){
        return monthJoined;
    }
    public void setYearJoined(int yj) throws BadMember{
        if (yearJoined >= 2013){
            this.yearJoined = yj;
        } else {
            throw new BadMember("Year joined must be equal to or greater than 2013.");
        }
    }
    public int getYearJoined(){
        return yearJoined;
    }
    public void setDues(double du){
        this.dues = du;
    }
    public double getDues(){
        return dues;
    }

    abstract double calculateCashBack();
    abstract double calculateDues();

    public String toString(){
        return ("\nName: " + getName() +
        "\nAge: " + getAge() +
        "\nYears of Membership: " + getYearsMember() +
        "\nPhone: " + getPhone() +
        "\nGood Standing: " + getGoodStanding() +
        "\nMember ID: " + getMemberID() +
        "\nMonth Joined: " + getMonthJoined() +
        "\nYear Joined: " + getYearJoined() +
        "\nDues: " + getDues());
    }

    public String compareTo(Member other){
        if (this.yearJoined > other.yearJoined){
            return (other.name + " has been a member for more years: Joined " + other.yearJoined);
        } else if (this.yearJoined < other.yearJoined) {
            return (this.name + " has been a member for more years: Joined " + this.yearJoined);
        } else{
            return ("Both members joined in the same year.");
        }
    }
}


