package pl.abc.faktury.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class CompanyDto {

    private Long id;
    private String nazwaFirmy;
    private String imie;
    private String nazwisko;
    private String email;
    private String tel;
    private String nrKonta;

    public CompanyDto(String nazwaFirmy, String imie, String nazwisko, String email, String tel, String nrKonta) {
        this.nazwaFirmy = nazwaFirmy;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.tel = tel;
        this.nrKonta = nrKonta;
    }

    public CompanyDto() {
    }

}
