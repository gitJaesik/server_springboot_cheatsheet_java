package com.lib.maguire.springapplicationcontext;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackageClasses = SpringapplicationcontextApplication.class)
public class ApplicationConfig {

//    @Bean
//    public BookRepository bookRepository() {
//        return new BookRepository();
//    }

    /*
    @Bean
    public BookService bookService() {
        BookService bookService = new BookService();
        bookService.setBookRepository(bookRepository());
        return bookService;
    }
     */

//    @Bean
//    public BookService bookService() {
//        return new BookService();
//    }

    /*
    @Bean
    public BookService bookService(BookRepository bookRepository) {
        BookService bookService = new BookService();
        bookService.setBookRepository(bookRepository);
        return bookService;
    }
     */
}
