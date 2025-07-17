package TestProject;

public class Admin extends User{
    public Admin(String name) {
        super(name);
    }

    @Override
    public boolean isHaspPrivileges() {
        return true;
    }
}
