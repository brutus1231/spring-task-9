package pl.sda;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class BookBo {

    List<Book> findByAuthor(String pesel) {
        Book book1 = new Book("Harry Potter", BigDecimal.valueOf(120));
        return List.of(
                book1);
    }
}
