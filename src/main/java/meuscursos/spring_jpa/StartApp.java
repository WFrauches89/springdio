package meuscursos.spring_jpa;

import meuscursos.spring_jpa.model.User;
import meuscursos.spring_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = repository.filtrarPorNome("Us");
        for(User u: users){
            System.out.println(u);
        }


    }

    private void insertUser() {
        User user = new User();
        user.setNome("Nome Qualquer");
        user.setUsername("qualquer");
        user.setPassword("123qualquer");
        repository.save(user);

        for (User u : repository.findAll()) {
            System.out.println(u);
        }
    }
}
