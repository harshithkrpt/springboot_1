package practice.harshith.demo.repository;

import org.springframework.data.repository.CrudRepository;
import practice.harshith.demo.model.Book;

public interface BookRepository  extends CrudRepository<Book,Long> {
}
