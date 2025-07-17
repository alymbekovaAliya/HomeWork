package _02_06;

public class Item {
    private String title;
    private double price;
    private int number;

    public Item(String title, double price, int number) {
        this.title = title;
        this.price = price;
        this.number = number;
    }

    public void addStock(int amount) {
        number += amount;
    }

    public void removeStock(int amout) {
        number-= amout;
    }

    public String printOf() {
       String count = number > 5 ? "есть товар на складе" : "осталось несколько штук";
        return "Наименование товара: " + title + "\n" +
                "Цена товара:  " + price + "\n" +
                count + "\n";
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }
}
