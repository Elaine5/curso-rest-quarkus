package io.github.dougllasfps.quarkussocial.domain.repository;

import io.github.dougllasfps.quarkussocial.domain.model.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped // cria uma instancia do UserRepository para ser usado onde quiser
public class UserRepository implements PanacheRepository<User> {
}
