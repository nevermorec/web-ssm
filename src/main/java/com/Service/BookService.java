package com.Service;

import com.Entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {
    public Book selectOne(int BookId);

    public List<Book> selectAll();

    public void insertBook(Book book);

    public void updateBook(Book book);

    public void deteleBook(int bookId);
}
