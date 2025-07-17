package OOP.Phone1;

public class iPhone {

    public static void main(String[] args) {
         Phone iphone = new Phone();
         iphone.brand = "Apple";
         iphone.model = "16Pro";
         iphone.color = "black";

        System.out.println("Phone: "  +  iphone.brand + " " + iphone.model + " " + iphone.color);

        System.out.println(iphone.call("Aliia"));
        System.out.println(iphone.receive("Allazor"));
        System.out.println(iphone.sendMessage("Mom"));
    }
}
