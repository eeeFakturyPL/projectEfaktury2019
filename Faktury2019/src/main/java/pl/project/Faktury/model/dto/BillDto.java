package pl.abc.faktury.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BillDto {

    private Long id;
    private String nrFakt;
    private String customerName;
    private String price;
    private Date date;

    public BillDto(String nrFakt, String customerName, String price, Date date) {
        this.nrFakt = nrFakt;
        this.customerName = customerName;
        this.price = price;
        this.date = date;
    }

    public BillDto() {
    }
}
