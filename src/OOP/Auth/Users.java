package OOP.Auth;

public class Users {
    public static SocialMedia inst = new SocialMedia("Instagram");

    public static void main(String[] args) {
        Account account1 = new Account("aliia", "aliia2507", "23456789");
        Account account2 = new Account("ilizar", "ilizar3112", "23456789");
        Account account3 = new Account("cholpon", "chop123456", "23456789");

        inst.createPosts("photo", "I was running");
        inst.createPosts("photo", "1234567890-");
        inst.createPosts("reals", "I am playing");
        inst.createPosts("reals", "I am playing23456789");
        inst.createPosts("photo", "Weekend with one republic");
        inst.createPosts("reals", "Weekend with Irina Kairatovna");


        inst.getPosts(inst.asd);


    }

}
