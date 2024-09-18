package JavaClass.Week13;

public class Login {
    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isMatch(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public String toString() {
        return "\nUsername: " + username + "\tPassword: " + password;
    }
}
