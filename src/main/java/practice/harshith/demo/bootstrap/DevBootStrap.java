package practice.harshith.demo.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import practice.harshith.demo.model.Author;
import practice.harshith.demo.model.Book;
import practice.harshith.demo.model.Publisher;
import practice.harshith.demo.repository.AuthorRepository;
import practice.harshith.demo.repository.BookRepository;
import practice.harshith.demo.repository.PublisherRepository;


@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootStrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Author eric = new Author("eric","kur");
        Publisher pub = new Publisher("hps","dos");
        Book dd = new Book("HASJS","132",pub);

        eric.getBooks().add(dd);
        dd.getAuthors().add(eric);

        authorRepository.save(eric);
        publisherRepository.save(pub);
        bookRepository.save(dd);


        Author bob = new Author("bob","nam");
        Publisher pub1 = new Publisher("nsj","d9os");
        Book pp = new Book("HAsdsSJS","132w4",pub1);

        bob.getBooks().add(pp);
        pp.getAuthors().add(bob);

        authorRepository.save(bob);
        publisherRepository.save(pub1);
        bookRepository.save(pp);

    }
}
