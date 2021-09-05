package com.example.usinggraphqlinspringbootapp.service.datafetcher;

import com.example.usinggraphqlinspringbootapp.model.Book;
import com.example.usinggraphqlinspringbootapp.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllBooksDataFetcher implements DataFetcher<List<Book>> {

    private BookRepository bookRepository;
    @Autowired
    public AllBooksDataFetcher(BookRepository bookRepository) {
        this.bookRepository=bookRepository;
    }
    @Override
    public List<Book> get(DataFetchingEnvironment dataFetchingEnvironment) {
        return bookRepository.findAll();
    }
}
