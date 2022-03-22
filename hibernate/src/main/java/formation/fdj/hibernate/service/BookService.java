package formation.fdj.hibernate.service;

import formation.fdj.hibernate.entity.Author;
import formation.fdj.hibernate.entity.Book;
import formation.fdj.hibernate.repository.AuthorRepository;
import formation.fdj.hibernate.repository.BookRepository;
import org.springframework.stereotype.Repository;

public class BookService {

    BookRepository bookRepository;
    AuthorRepository authorRepository;
    public void save(Book book) {
        var author = authorRepository.findById(1L);
    }
}
