package TestProject;

public class Demo {
    public static void main(String[] args) {
        User admin = new Admin("andrey");
        User guest = new Guest("sasha");

        System.out.println(admin.isHaspPrivileges());
        System.out.println(guest.isHaspPrivileges());
    }
}
