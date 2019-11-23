package pl.abc.faktury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import pl.abc.faktury.model.entity.Bill;

import java.util.Date;

public interface BillRepository  extends JpaRepository<Bill, Long> {

    Bill findBillByCustomerName(@Param("customerName") String customerName);
    Bill findBillByNrFakt(@Param("nrFakt") String nrFakt);
}
