package com.nt.service;

import java.util.List;

import com.nt.entity.Book;

public interface BookService {

	public String addOrUpdateBook(Book book);

	public List<Book> getAllBooks();

	public String deleteBook(Integer bookId);

}
