package pl.abc.faktury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.abc.faktury.model.entity.User;

public interface UserRepository  extends JpaRepository<User, Long> {

}
