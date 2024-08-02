package com.josueyax.webapp.bibliotecaIN5CV.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.josueyax.webapp.bibliotecaIN5CV.model.Categoria;
import com.josueyax.webapp.bibliotecaIN5CV.repository.CategoriaRepository;

@Service
public class CategoriaService implements ICategoriaService{

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> listarCategorias() {
       return categoriaRepository.findAll();
    }

    @Override
    public Categoria buscarCategoriaPorId(long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @Override
    public Categoria guardarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public void eliminarCategoria(Categoria categoria) {
        categoriaRepository.delete(categoria);
    }

}
