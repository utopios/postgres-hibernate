package formation.fdj.hibernate.service;

import formation.fdj.hibernate.entity.Book;
import org.hibernate.SQLQuery;
import org.hibernate.query.NativeQuery;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class AuthorService {

    @PersistenceContext
    EntityManager entityManager;

    public void update() {
        //entityManager.createQuery("Update Book set title= 'new vaue'").executeUpdate();


        /*Query nativeQuery = entityManager.createNativeQuery("update book set title = 'newvalue'");
        nativeQuery.unwrap(NativeQuery.class).addSynchronizedEntityClass(Book.class);*/
    }

    public List get() {
        return entityManager.createQuery("SELECT b FROM Book b").setHint("org.hibernate.cacheable", true).getResultList();
    }
}
