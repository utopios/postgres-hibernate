package formation.fdj.hibernate.service;

import formation.fdj.hibernate.entity.Author;
import formation.fdj.hibernate.entity.Book;
import formation.fdj.hibernate.repository.AuthorRepository;
import formation.fdj.hibernate.repository.BookRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    BookRepository bookRepository;
    AuthorRepository authorRepository;
    public void save(Book book) {
        var author = authorRepository.findById(1L);
    }
    public void batchBooksAndAuthors() {
        List<Book> books = new ArrayList<>();
        for(int i=1; i <= 10; i++) {
            Book b = new Book();
            for(int j=1; j < 10; j++) {
                b.addAuthor(new Author());
            }
        }
        authorRepository.saveInBatch(books);
    }
}
