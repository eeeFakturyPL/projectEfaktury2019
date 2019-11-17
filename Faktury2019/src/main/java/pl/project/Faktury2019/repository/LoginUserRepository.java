package pl.project.Faktury2019.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.project.Faktury2019.model.entity.LoginUser;

public interface LoginUserRepository extends JpaRepository<LoginUser,Long> {


    Long countByLogin(String login);



}