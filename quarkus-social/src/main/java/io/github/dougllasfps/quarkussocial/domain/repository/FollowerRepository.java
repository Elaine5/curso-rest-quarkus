package io.github.dougllasfps.quarkussocial.domain.repository;

import io.github.dougllasfps.quarkussocial.domain.model.Follower;
import io.github.dougllasfps.quarkussocial.domain.model.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FollowerRepository implements PanacheRepository<Follower> {

    public boolean follows(User follower, User user){

    }
}