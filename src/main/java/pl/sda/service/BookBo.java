package pl.sda.service;

import org.springframework.stereotype.Component;
import pl.sda.model.BookEntity;

import java.math.BigDecimal;
import java.util.List;

@Component
public class BookBo {

    List<BookEntity> findByAuthor(String pesel) {
        BookEntity book1 = new BookEntity("Harry Potter", BigDecimal.valueOf(120));
        return List.of(book1);
    }
}
