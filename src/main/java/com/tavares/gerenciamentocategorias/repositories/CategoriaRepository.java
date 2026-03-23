package com.tavares.gerenciamentocategorias.repositories;

import com.tavares.gerenciamentocategorias.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
