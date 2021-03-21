package practice.harshith.demo.repository;

import org.springframework.data.repository.CrudRepository;
import practice.harshith.demo.model.Publisher;


public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
