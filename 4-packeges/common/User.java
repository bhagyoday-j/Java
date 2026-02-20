package common;

public class User {

    public String name;        // public -> everywhere
    protected int age;         // protected -> same package + subclass
    String role;               // default -> same package only
    private String password;   // private -> same class only

    public User(String name, int age, String role, String password) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.password = password;
    }

    // public method to access private variable
    public void showPassword() {
        System.out.println("Password: " + password);
    }
}
