package pl.project.Faktury2019.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_address")
    private Long id;
    private String miasto;
    private String ulica;
    private Long nrBud;
    private Long nrLok;
    private String kodPoczt;

    public Address(String miasto, String ulica, Long nrBud, Long nrLok, String kodPoczt) {
        this.miasto = miasto;
        this.ulica = ulica;
        this.nrBud = nrBud;
        this.nrLok = nrLok;
        this.kodPoczt = kodPoczt;
    }

    @OneToOne
    @JoinColumn(name = "id_company")
    private Company company;


    public Long getId() {
        return id;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public Long getNrBud() {
        return nrBud;
    }

    public void setNrBud(Long nrBud) {
        this.nrBud = nrBud;
    }

    public Long getNrLok() {
        return nrLok;
    }

    public void setNrLok(Long nrLok) {
        this.nrLok = nrLok;
    }

    public String getKodPoczt() {
        return kodPoczt;
    }

    public void setKodPoczt(String kodPoczt) {
        this.kodPoczt = kodPoczt;
    }
}
