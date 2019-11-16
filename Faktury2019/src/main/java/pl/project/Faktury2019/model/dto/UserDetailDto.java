package pl.project.Faktury2019.model.dto;

import javax.validation.constraints.Size;

public class UserDetailDto {

    @Size(min = 3, max = 20, message = "login lenght sholud be between 3 and 20 characters.")
    private String login;

    @Size(min = 8, max = 20, message = "login lenght sholud be between 8 and 20 characters.")
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
