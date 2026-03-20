package br.com.gabriel.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users") // nome da entidade, tabela
public class UserModel {

    @Id // essa annotation diz que esse atributo é o id
    @GeneratedValue(generator = "UUID") // essa annotation faz com que o jpa gere o id.
    private UUID id; // o UUID gera um id unico

    //@Column(name = "usuario") essa annotation define o nome da coluna, se não tiver o jpa pega o nome dos atributos automaticamente
    @Column(unique = true) // coloca uma restrição (constraint) no atributo como único.
    private String username;
    private String name;
    private String password;

    @CreationTimestamp // pega o tempo em que um atributo foi criado no banco de dados
    private LocalDateTime createdAt;

}
