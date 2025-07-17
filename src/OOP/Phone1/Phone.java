package OOP.Phone1;

public class Phone {
    public  String brand;
    public  String model;
    public  String color;

    public String call(String name) {
        return "Calling " + name;
    }

    public String receive(String name) {
        return "Received a call from " + name;
    }

    public String sendMessage(String name) {
        return "Send message to " + name;
    }


}
