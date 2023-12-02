package ir.ac.kntu;

public class User {
    protected String userName;
    protected String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User() {

    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
