package com.yaytech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.yaytech.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel = "bookCategory", path = "book_category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
