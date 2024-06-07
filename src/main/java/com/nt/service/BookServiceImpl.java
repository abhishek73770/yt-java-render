package com.nt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nt.entity.Book;
import com.nt.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository repo;

	public BookServiceImpl(BookRepository repo) {
		this.repo = repo;
	}

	@Override
	public String addOrUpdateBook(Book book) {

		Integer bookId = book.getBookId();
		System.out.println(book);
		Book save = repo.save(book);
		System.out.println(save);

		if (save != null) {
			return "Record Inserted";
		} else {
			return "record updated";

		}
	}

	@Override
	public List<Book> getAllBooks() {
		return repo.findAll();
	}

	@Override
	public String deleteBook(Integer bookId) {
		repo.deleteById(bookId);
		return "book deleted";
	}

}
