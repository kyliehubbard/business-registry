import java.util.ArrayList;

public class Testing {
    static ArrayList<Member> memberDB = new ArrayList<Member>();
    
    public static void main(String[] args){

        //MEMBER TESTING:
        Member member1 = new PlatinumMember("Dean", 20, 3, "123-456-7890", true, 112233, 2020, 
    6, 150, 600, 220, 320);
   
        memberDB.add(member1);
        //System.out.println(member1.toString());

        Member member2 = new GoldMember("Shauna", 18, 1, "246-812-1416", false, 348921, 2022, 
        8, 100, 240, 550);

        memberDB.add(member2);
        //System.out.println(member2.toString());

        Member member3 = new BronzeMember("Alexia", 25, 4, "369-125-1821", true, 583419, 2019, 
        2, 50, 200, 450, 100);

        memberDB.add(member3);
        //System.out.println(member3.toString())

        //System.out.println(memberDB);

        //System.out.println(member1.compareTo(member2));

        //ONLINE ORDER/GROCERY ITEM TESTING:
        GroceryItem item1= new GroceryItem("Milk", 18, 30, 13579, GroceryCategory.DAIRY);
        //System.out.println(item1.toString());

        GroceryItem item2 = new GroceryItem("Cucumber", 8, 0, 13271, GroceryCategory.PRODUCE);
        //System.out.println(item2.toString());

        GroceryItem item3 = new GroceryItem("Cake", 15, 2, 13990, GroceryCategory.MISCELLANEOUS);
        //System.out.println(item3.toString());

        ArrayList<GroceryItem> basketItems1 = new ArrayList<>();
        basketItems1.add(item1);
        basketItems1.add(item2);

        ArrayList<GroceryItem> basketItems2 = new ArrayList<>();
        basketItems2.add(item3);
        basketItems2.add(item1);

        ArrayList<OnlineOrder> allorders = new ArrayList<>();

        OnlineOrder order1 = new OnlineOrder(member3, basketItems1);
        allorders.add(order1);
        //System.out.println(order1.toString());

       OnlineOrder order2 = new OnlineOrder(member1, basketItems2);
       allorders.add(order2);
       //System.out.println(order2.toString());

       //System.out.println(allorders);

    }

}
