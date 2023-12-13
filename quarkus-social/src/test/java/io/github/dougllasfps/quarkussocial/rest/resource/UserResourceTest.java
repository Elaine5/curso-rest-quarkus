package io.github.dougllasfps.quarkussocial.rest.resource;

import io.github.dougllasfps.quarkussocial.rest.dto.CreateUserRequest;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
class UserResourceTest {

    @Test
    @DisplayName("should create an user successfully")
    public void createUserTest(){

        var user = new CreateUserRequest();
        user.setName("Elaine");
        user.setAge(10);

        var response =
                given()
                    .contentType(ContentType.JSON) //faz transformar o objeto acima em JSON
                    .body(user) // passa o objeto user
                .when()
                    .post("/users")
                .then()
                    .extract().response();

    }


}