package pl.abc.faktury.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class AddressDto {

    private Long id;
    private String miasto;
    private String ulica;
    private String nrBudLok;
    private String kodPoczt;

    public AddressDto(String miasto, String ulica, String nrBudLok, String kodPoczt) {
        this.miasto = miasto;
        this.ulica = ulica;
        this.nrBudLok = nrBudLok;
        this.kodPoczt = kodPoczt;
    }

    public AddressDto() {
    }
}
