package day35_Encapsulation.dinner_tasks;

public class Credentials {
    private String username, password;

    //CONSTRUCTOR
    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    //GETTER
    public String getUsername() {
        return username;
    }
    //GETTER
    public String getPassword() {
        return password;
    }

    //SETTER
    public void setUsername(String username) {
        this.username = username;
    }
    //SETTER
    public void setPassword(String password) {
        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        char[] chars = password.toCharArray();
        for (char each : chars) {
            if (Character.isLetter(each)) {
                hasLetter = true;
            } else if (Character.isDigit(each)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }
        if ((password.length() >= 8 && !password.contains(" ")) && hasLetter && hasDigit && hasSpecialChar) {
            this.password = password;
        } else {
            System.err.println("Password is not strong enough");
            System.exit(0);
        }

    }

    //TOSTRING METHOD
    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
