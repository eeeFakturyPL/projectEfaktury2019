package pl.abc.faktury.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
public class Bill implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nrFakt;
    private String customerName;
    private String price;
    private Date date;

    @ManyToOne
    @JoinColumn()
    private User user;

    @ManyToOne
    @JoinColumn()
    private Customer customer;
}
