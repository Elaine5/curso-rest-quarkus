package io.github.dougllasfps.quarkussocial.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "post_text")
    private String text;

    @Column(name = "dateTime")
    private LocalDateTime dateTime;

    @ManyToOne //por ter chave estrangeira, quer dizer também que teremos muitas postagens para um unico usuário
    @JoinColumn(name = "user_id")
    private User user;

}
