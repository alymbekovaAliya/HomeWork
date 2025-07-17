package OOP.Food;

public class PlovMain {
    public static void main(String[] args) {
        Plov tashkent = new Plov();
        tashkent.carrot = 9;

        Plov uzgen = new Plov();
        Plov prazdnich = new Plov();
        Plov belyi = new Plov();

        System.out.println(tashkent);
        System.out.println(uzgen);
        System.out.println(prazdnich);
        System.out.println(belyi);

        Plov tashkent2 = new Plov(1.2,3,1,6);
        Plov uzgen2 = new Plov(1,3.9,1,6);

        System.out.println(tashkent2);
    }
}
