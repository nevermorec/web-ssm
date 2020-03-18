import com.Entity.Book;
import com.Service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        BookService bookService = (BookService) context.getBean("bookService");
        BookService bookService = context.getBean("bookService", BookService.class);
//        Book book = new Book(0, "易经", 99, "");
        System.out.println(bookService.selectAll());
//        bookService.insertBook(book);
    }
}
