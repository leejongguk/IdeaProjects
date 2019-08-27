package sample15;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/*@Component*/
@Repository
public class BookDaoImpl implements BookDao {
    public Book getBook(String title) {

        return new Book(title, 25000);
    }
}