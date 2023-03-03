package fr.M2i.todolistjaxrs.api;

import fr.M2i.todolistjaxrs.data.DataAccess;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;



@Path("/todo")
public class TodoResource {
    @GET
    @Path("/{id}")
    public void getTodoByID(@PathParam("id") int todoId) {}

    @GET
    @Path("/test")
    public void getUrgenceTest() {
        try(DataAccess da = DataAccess.getInstance())
        {
            return String.format("%s", da.isConnectionSuccess());
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
}
