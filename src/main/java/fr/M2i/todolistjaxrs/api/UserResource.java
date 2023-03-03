package fr.M2i.todolistjaxrs.api;

import fr.M2i.todolistjaxrs.model.User;
import jakarta.ws.rs.*;

@Path("/user")
public class UserResource {

    @GET
    @Path("/{id}")
    public String getUser(@PathParam("id") int userId) {
        return null;
    }

    @POST
    @Path("/create")
    public String createUser(@FormParam("userName") String userName, @FormParam("userFirstName") String userFirstName) {
        User user = new User(userName, userFirstName);
        return null;
    }

}
