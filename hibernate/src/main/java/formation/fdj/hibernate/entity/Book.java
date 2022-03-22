package formation.fdj.hibernate.entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Cacheable
@Cache(usage= CacheConcurrencyStrategy.READ_WRITE)
public class Book {

    @Id
    private Long id;

    private String title;
    @Cacheable
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @OneToMany
    private List<Author> authors;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
