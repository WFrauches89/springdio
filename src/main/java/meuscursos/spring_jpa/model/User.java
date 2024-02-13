package meuscursos.spring_jpa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tabela_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;

    @Column(length = 50, nullable = false)
    private String nome;

    @Column(length = 20, nullable = false)
    private String username;

    @Column(length = 20, nullable = false)
    private String password;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return  "id:" + id +
                ", nome:'" + nome + '\'' +
                ", username:'" + username + '\'' +
                ", password:'" + password ;
    }
}
