package control;

import entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.BookService;
@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/Book")
    public ModelAndView findBookById(int id){
        ModelAndView modelAndView=new ModelAndView();
        Book book = bookService.findBookById(id);
        modelAndView.setViewName("book.jsp");
        modelAndView.addObject("book",book);
        return modelAndView;
    }
}
