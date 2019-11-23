package pl.abc.faktury.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private Long id;
    private String nip;
    private String haslo;
    private String role;

    public UserDto(String nip, String haslo, String role, CompanyDto companyDto, AddressDto addressDto) {
        this.nip = nip;
        this.haslo = haslo;
        this.role = role;
    }

    public UserDto() {
    }
}
