package _02_06;

public class Warehouse {
    public static void main(String[] args) {
        Item macbook = new Item("mackbook", 120000, 20);
        Item iphone = new Item("iphone", 80000, 10);
        Item iPad = new Item("iPad", 90000, 5);
        Item watch = new Item("Watch", 50000, 2);

        System.out.println(macbook.printOf());
        System.out.println(iphone.printOf());
        System.out.println(iPad.printOf());
        System.out.println(watch.printOf());

        macbook.addStock(4);
        System.out.println(macbook.getNumber());

        iphone.removeStock(5);
        System.out.println(iphone.getNumber());


    }
}
