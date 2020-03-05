package com.yaytech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yaytech.entity.Book;

public interface BookRepository  extends JpaRepository<Book, Long>{

}
