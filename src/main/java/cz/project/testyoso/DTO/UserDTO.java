package cz.project.testyoso.DTO;

public class UserDTO {

    private String username;
    private String password;
    private String givenName;
    private String lastName;

    public UserDTO(String username, String password, String givenName, String lastName) {
        this.username = username;
        this.password = password;
        this.givenName = givenName;
        this.lastName = lastName;
    }

    public UserDTO() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
