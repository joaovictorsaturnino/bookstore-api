package com.victor.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victor.bookstore.domain.Categoria;
import com.victor.bookstore.domain.Livro;
import com.victor.bookstore.repositories.CategoriaRepository;
import com.victor.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;
	
	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informática", "Livros de informática");
		Categoria cat2 = new Categoria(null, "Terror", "Livros de terror");
		Categoria cat3 = new Categoria(null, "Ficção", "Livros de ficção");

		
		Livro l1 = new Livro(null, "Clean code", "Robert Martin", "blablala", cat1);
		Livro l2 = new Livro(null, "Programe bem", "Robert Martin", "blebleble", cat1);
		Livro l3 = new Livro(null, "O poço e o pêndulo", "Edgar Allan Poe", "bliblibli", cat2);
		Livro l4 = new Livro(null, "O Jogador Nº 1", "Sam Remi", "blobloblo", cat3);
		Livro l5 = new Livro(null, "O Corvo", "Edgar Allan Poe", "blublublu", cat2);
		
		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat2.getLivros().addAll(Arrays.asList(l3, l5));
		cat3.getLivros().addAll(Arrays.asList(l4));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
	}
}
