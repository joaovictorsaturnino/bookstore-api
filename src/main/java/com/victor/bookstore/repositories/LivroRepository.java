package com.victor.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.victor.bookstore.domain.Categoria;

@Repository
public interface LivroRepositpry extends JpaRepository<Livro, Integer> {

}
