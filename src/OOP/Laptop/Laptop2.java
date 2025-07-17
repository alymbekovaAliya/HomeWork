package OOP.Laptop;

public class Laptop2 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.brand = "apple";
        laptop.model = "mac";
        laptop.color = "gray";
        laptop.diameter = "15";

        System.out.println(laptop.brand + " " + laptop.model + " " + laptop.color + " " + laptop.diameter);

        System.out.println(laptop.develop());
        System.out.println(laptop.play());
    }
}
