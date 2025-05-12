package com.example.bookapi.service;

import com.example.bookapi.dto.BookDTO;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface BookService {
    BookDTO createBook(BookDTO bookDTO);
    BookDTO updateBook(Long id, BookDTO bookDTO);
    void deleteBook(Long id);
    BookDTO getBookById(Long id);
    List<BookDTO> getAllBooks(Pageable pageable);
}
