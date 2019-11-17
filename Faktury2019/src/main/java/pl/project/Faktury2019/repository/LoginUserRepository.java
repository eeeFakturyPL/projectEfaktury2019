package pl.project.Faktury2019.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.project.Faktury2019.model.entity.UserDetail;

public interface LoginUserRepository extends JpaRepository<UserDetail,Long> {


    Long countByLogin(String login);



}