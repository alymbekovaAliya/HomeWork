package OOP.Laptop;

public class Laptop {
    public String brand;
    public String model;
    public String diameter;
    public String color;

    public String develop() {
        switch (model) {
            case "mac":
                return "You can use Xcode for developing on iphone";
            default:
                return "qwerty";
        }
    }

    public String play() {
        return "You can play";
    }

}
