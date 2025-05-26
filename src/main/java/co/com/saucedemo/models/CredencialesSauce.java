package co.com.saucedemo.models;

public class CredencialesSauce {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public CredencialesSauce(String username, String password){
        this.username = username;
        this.password = password;
    }
}
