package pl.abc.faktury.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nip;
    private String haslo;
    private String role;

    @OneToOne
    @JoinColumn()
    private Company company;

    @OneToMany()
    private List<Customer> customers;

    @OneToMany()
    private List<Bill> bills;

    public Long getId() {
        return id;
    }
}
