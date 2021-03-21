package practice.harshith.demo.repository;

import org.springframework.data.repository.CrudRepository;
import practice.harshith.demo.model.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
