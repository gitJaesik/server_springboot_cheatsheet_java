package com.lib.maguire.service;

import java.util.Date;

// java bean
// do not managed by spring

public class Book {

    private Date created;

    private BookStatus bookStatus;

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

}
