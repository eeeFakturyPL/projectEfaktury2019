package pl.abc.faktury.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class Company implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nazwaFirmy;
    private String imie;
    private String nazwisko;
    private String email;
    private String tel;
    private String nrKonta;

    @OneToOne()
    private User user;

    @OneToOne()
    private Address address;
}
