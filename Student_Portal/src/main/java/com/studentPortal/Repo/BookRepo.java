package com.studentPortal.Repo;

import com.studentPortal.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo  extends JpaRepository<Book, String> {
}
