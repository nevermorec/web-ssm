package com.Dao;

import com.Entity.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("bookMapper")
public interface BookMapper {

    public Book selectOne(int bookId);

    public List<Book> selectAll();

    public void insertBook(Book book);

    public void delete(int bookId);

    public void update(Book book);
}
