package com.example.usinggraphqlinspringbootapp.service.datafetcher;

import com.example.usinggraphqlinspringbootapp.model.Book;
import com.example.usinggraphqlinspringbootapp.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookDataFetcher implements DataFetcher<Book> {
    private BookRepository bookRepository;
    @Autowired
    public BookDataFetcher(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    @Override
    public Book get(DataFetchingEnvironment dataFetchingEnvironment) {
        String isn = dataFetchingEnvironment.getArgument("id");
        return bookRepository.findById(isn).orElse(null);
    }
}