package pl.abc.faktury.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto {

    private Long id;
    private String nip;
    private String nazwa;
    private String email;
    private String tel;
    private String nrKont;

    public CustomerDto(String nip, String nazwa, String email, String tel, String nrKont, CustomerDetailsDto customerDetailsDto) {
        this.nip = nip;
        this.nazwa = nazwa;
        this.email = email;
        this.tel = tel;
        this.nrKont = nrKont;
    }

    public CustomerDto() {
    }
}
