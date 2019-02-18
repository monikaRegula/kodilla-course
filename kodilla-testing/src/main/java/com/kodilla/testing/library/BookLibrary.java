package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary  {

    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }


    public List<Book> listBooksWithCondition(String title){
      List<Book> bookList = new ArrayList<>();
      if (title.length() <3 ) return bookList;

      List<Book> resultBookList = libraryDatabase
              .listBooksWithCondition(title);
      if (resultBookList.size() >20) return  bookList;
      bookList = resultBookList;
      return bookList;
    }


    public List<Book> listBooksInHandsOf(LibraryUser libraryUser){

        List<Book> bookList = new ArrayList<>();
        bookList = libraryDatabase
                .listBooksInHandsOf(libraryUser);
        return bookList;
    }

}
