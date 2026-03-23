package com.tavares.gerenciamentocategorias.services;

import com.tavares.gerenciamentocategorias.models.Categoria;
import com.tavares.gerenciamentocategorias.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;

    public Categoria salvar(Categoria categoria){
        return repository.save(categoria);
    }

    public List<Categoria> listarTodos(){
        return repository.findAll();
    }

    public Optional<Categoria> buscarPorId(Long id){
        return repository.findById(id);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}
