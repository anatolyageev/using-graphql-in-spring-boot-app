package com.example.usinggraphqlinspringbootapp.repository;

import com.example.usinggraphqlinspringbootapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
