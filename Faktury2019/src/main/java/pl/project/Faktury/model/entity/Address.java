package pl.abc.faktury.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String miasto;
    private String ulica;
    private String nrBudLok;
    private String kodPoczt;

    @OneToOne
    @JoinColumn()
    private Company company;
}
