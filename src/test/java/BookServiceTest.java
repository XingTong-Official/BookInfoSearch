
import entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.BookService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-service.xml","classpath:application-dao.xml"})
public class BookServiceTest {
    @Autowired
    private BookService bookService;
    @Test
    public void findBookById()
    {
        Book book=bookService.findBookById(1);
        System.out.println("id:"+book.getId());
        System.out.println("name:"+book.getName());
        System.out.println("author:"+book.getAuthor());
        System.out.println("press:"+book.getPress());
    }
}