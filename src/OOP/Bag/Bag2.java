package OOP.Bag;

public class Bag2 {
    public static void main(String[] args) {
        Bag bag = new Bag();
        bag.type = "Tote bag";
        bag.size = "Big";
        bag.color = "Brown";

        System.out.println(bag.carry());
        System.out.println(bag.put());
    }
}
