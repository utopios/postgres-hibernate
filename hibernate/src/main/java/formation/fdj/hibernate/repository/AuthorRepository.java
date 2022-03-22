package formation.fdj.hibernate.repository;

import formation.fdj.hibernate.entity.Author;
import formation.fdj.hibernate.impl.BatchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends BatchRepository<Author, Long> {
}
