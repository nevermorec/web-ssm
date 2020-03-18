package com.Controller;


import com.Entity.Book;
import com.Service.BookService;
import com.Service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BookController {

    private BookService bookService;
    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
        System.out.println(bookService);
        System.out.println(bookService.selectOne(1));
    }

    @RequestMapping(value = "/allbook")
    public String allBook(Model model) {
        List<Book> list = bookService.selectAll();
        System.out.println(list);
        model.addAttribute("list", list);
        return "allbook";
    }
}
