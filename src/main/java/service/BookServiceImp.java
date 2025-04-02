package service;

import dao.BookMapper;
import entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImp implements BookService{
    @Autowired
    BookMapper bookMapper;
    @Override
    public Book findBookById(int id) {
        return bookMapper.findBookById(id);
    }
}
