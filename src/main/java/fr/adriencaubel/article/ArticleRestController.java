package fr.adriencaubel.article;

import java.util.HashMap;
import java.util.Map;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/articles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ArticleRestController {

    @GET
    public Response helloworld() {
        // JSON response structure
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello world");

        // Return JSON response
        return Response.ok(response).build();
    }
}
