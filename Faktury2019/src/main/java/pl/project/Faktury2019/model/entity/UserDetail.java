package pl.project.Faktury2019.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_detail")
public class UserDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;

    public UserDetail(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @OneToOne
    @JoinColumn(name = "id_company")
    private Company company;


    public Long getId() {
        return id;
    }

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
