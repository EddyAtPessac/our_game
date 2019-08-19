package fr.gamein.service;

import fr.gamein.jwt.JWTTokenNeeded;
import fr.gamein.model.Githuber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response.ResponseBuilder;
import java.util.List;

//@slf4j
@Path("/")
public class RsGithubersService {

    private final Logger log = LoggerFactory.getLogger("RsGitService");


 /*   @Inject
    private GithuberDAO gitDao;

    @Inject
    private GithubUtils gutil;  //Pour parseGithuber() Inject obligé en private sinon pb...

    @Inject GithubersService gitServ;

    Githuber lastGitReq= null;

*/
 /*   @Inject
    @Context UriInfo uriInfo;
*/
    @PostConstruct
    void postConstruct() {
        log.info("RsGithubersService ready");
    }

    @GET
    @Path("githubers")
    @Produces(MediaType.APPLICATION_JSON)
    @JWTTokenNeeded
    public List<Githuber> List() {
        log.info("Githubers list returned");
        return null; //gitServ.getAllGithubers();
    }

    @GET
    @Path("getgithuber/{login}")
    @Produces(MediaType.APPLICATION_JSON)
    public Githuber GetGithuber (@PathParam("login") String login) {
        log.info("GET the githuber '"+login+"'.");
        Githuber git= null; //gitServ.getGithuber(login);
        return git;
    }

    @POST
    @Path("githuber/{login}")
    public Response Track(@PathParam("login") String login) {
        log.info("POST with '"+ login +"' parameter");
        ResponseBuilder respB= Response.status(Response.Status.CONFLICT); // By default
        Githuber git=  null; //gitServ.getGithuber(login);
        if (git == null )  { // Not already tracked
                //git= gitServ.track(login);     // Get and track the gihuber
                if (git != null ) { // git login is  found
                //uriInfo.getBaseUriBuilder().path("githuber").path(login).build();
                respB = Response.created(UriBuilder.fromPath("getgithuber/" + git.getgitId()).build());
                } else {  // git login not found
                        respB = Response.status(Response.Status.GONE);
                } // if/else git login found
        } // git is not already tracked
        return respB.build();
    } // Track


    @DELETE
    @Path("githuber/{gitId}")
    public Response untrack(@PathParam("gitId")String gitId) {
        log.info("DELETE '"+ gitId +"' parameter");
        ResponseBuilder respB= Response.status(Response.Status.OK); // By default
        Githuber git=  null; //gitServ.getGithuber(gitId);
        if (git != null ) {
            //gitServ.unTrack(gitId);
        } // Git found
        else {
            respB= Response.status(Response.Status.GONE);
        }
        return respB.build();
    } // unTrack
}
