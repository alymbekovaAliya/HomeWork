package OOP.Cafe;

public class Cafe {
    public String name;
    public String menu;
    public boolean kitchen;
    public boolean bar;
    public boolean hall;
    public int cooker;
    public int staff;

    public Cafe() {
        new Cafe("Bublik");
    }

    public Cafe(String name) {
        this.name = name;
    }

    public Cafe(String menu1, boolean kitchen1) {
        menu = menu1;
        kitchen = kitchen1;
    }

    public Cafe(boolean kitchen, String menu1) {
        menu = menu1;
        this.kitchen = kitchen;
    }

}
