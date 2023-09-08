package io.github.dougllasfps.quarkussocial.rest.resource;

import io.github.dougllasfps.quarkussocial.domain.model.Post;
import io.github.dougllasfps.quarkussocial.domain.model.User;
import io.github.dougllasfps.quarkussocial.domain.repository.FollowerRepository;
import io.github.dougllasfps.quarkussocial.domain.repository.UserRepository;
import io.github.dougllasfps.quarkussocial.rest.dto.CreatePostRequest;
import io.github.dougllasfps.quarkussocial.rest.dto.PostResponse;
import io.quarkus.panache.common.Sort;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.stream.Collectors;

@Path("/users/{userId/followers}")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FollowerResource {

    private FollowerRepository repository;
    private UserRepository userRepository;

    @Inject
    public FollowerResource(FollowerRepository repository, UserRepository userRepository) {

        this.repository = repository;
        this.userRepository = userRepository;
    }



//    @POST
//    @Transactional // para fazer alterção na base é necessario esta anotação
//    public Response savePost(
//            @PathParam("userId") Long userId, CreatePostRequest request){
//
//        User user = userRepository.findById(userId);
//        if (user == null){
//            return Response.status(Response.Status.NOT_FOUND).build();
//        }
//
//        Post post = new Post();
//        post.setText(request.getText());
//        post.setUser(user);
//
//        repository.persist(post);
//
//        return Response.status(Response.Status.CREATED).build();
//    }

//    @GET
//    public Response listPosts( @PathParam("userId") Long userId ){
//        User user = userRepository.findById(userId);
//        if (user == null){
//            return Response.status(Response.Status.NOT_FOUND).build();
//        }
//
//        var query = repository.find("user", Sort.by("dateTime",
//                Sort.Direction.Descending), user);
//        var list = query.list();
//
//        // está forma de código foi escrita para ao listar os dados, apenas venha os dados do text e do dateTime
//        var postResponseList = list.stream()
//                //.map(post -> PostResponse.fromEntity(post)) // segunda forma que pode ser escrita
//                .map(PostResponse::fromEntity) // forma escrita significa método de referencia
//                .collect(Collectors.toList());
//
//        return Response.ok(postResponseList).build();
//    }

}

