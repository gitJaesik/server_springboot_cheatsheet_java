package com.lib.maguire.whiteshipautowired;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class BookService {

// spring bean life cycle interface?
// bean factory
//public class BookService implements InitializingBean {
//    @Override
//    public void afterPropertiesSet() throws Exception {
//
//    }

//    @Autowired(required = false)
//    BookRepository bookRepository;

//    @Autowired(required = false) // bean을 못 찾아도 동작하도록 함 (생성자가 아니기 때문)
//    public void setBookRepository(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }

//    @Autowired
//    // bookRepository bean is not exist : error
//    public BookService(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }

//    @Autowired @Qualifier("maguireBookRepository")
//    BookRepository bookRepository;

//    @Autowired
//    List<BookRepository> bookRepositoryList;
//
//    public void printBookRepository() {
////        System.out.println(bookRepository.getClass());
//        this.bookRepositoryList.forEach(System.out::println);
//    }


    @Autowired
    BookRepository myBookRepository;

    public void printBookRepository() {
        System.out.println(myBookRepository.getClass());
    }

    // do thing after bean created
    @PostConstruct
    public void setUp() {
        System.out.println(myBookRepository.getClass());
    }

}
