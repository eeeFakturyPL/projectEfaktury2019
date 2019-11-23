package pl.abc.faktury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.abc.faktury.model.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Long> {

}
