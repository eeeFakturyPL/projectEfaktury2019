package pl.abc.faktury.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nip;
    private String nazwa;
    private String email;
    private String tel;
    private String nrKont;

    @OneToOne
    @JoinColumn()
    private CustomerDetails customerDetails;

    @ManyToOne
    @JoinColumn()
    private User user;

    @OneToMany()
    private List<Bill> bills;
}
