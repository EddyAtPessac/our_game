package fr.gamein.dao;

import fr.gamein.service.GithubUtils;
import fr.gamein.model.Githuber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Map;

@ApplicationScoped
@Jpa
public class JpaGithuberDao  {

    @PersistenceContext(unitName = "GitPersist")
    private EntityManager em;

    private Map<String, Githuber> gitHuberMap=null; //new HashMap<>();
    private final Logger slf4jLogger = LoggerFactory.getLogger("JpaGithuber");
    @Inject
    private GithubUtils gutil;  //Inject obligé en private sinon pb...

    public List<Githuber> getGithubers() {
        List<Githuber> myList = (List<Githuber>) em.createQuery( "from Githuber " , Githuber.class)
        .getResultList();
        return (myList);
    }

    public void deleteGithuber(String gitId) {
        // TODO delete githuber gitId from list;
    }

    public void saveGithuber(Githuber githuber) {
        gitHuberMap.put(githuber.getLogin(), gutil.parseGithuber(githuber.getLogin()));
        ;
    }

}
