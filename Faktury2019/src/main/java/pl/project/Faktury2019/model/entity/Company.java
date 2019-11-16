package pl.project.Faktury2019.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_company")
    private Long id;
    private String name;
    private String email;

    public Company(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @OneToOne(mappedBy = "company")
    private UserDetail userDetail;

    @OneToOne(mappedBy = "company")
    private Address address;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }
}
