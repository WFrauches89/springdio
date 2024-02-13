package meuscursos.spring_jpa.repository;

import meuscursos.spring_jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByNomeContaining(String nome);

    @Query("SELECT u FROM User u WHERE u.nome LIKE %:nome%")
    List<User> filtrarPorNome(@Param("nome") String nome);

}
