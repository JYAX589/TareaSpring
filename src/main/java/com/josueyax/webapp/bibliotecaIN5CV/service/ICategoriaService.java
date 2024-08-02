package com.josueyax.webapp.bibliotecaIN5CV.service;

import java.util.List;

import com.josueyax.webapp.bibliotecaIN5CV.model.Categoria;

public interface ICategoriaService {
    public List<Categoria> listarCategorias();

    public Categoria buscarCategoriaPorId(long id);

    public Categoria guardarCategoria(Categoria categoria);

    public void eliminarCategoria(Categoria categoria);
}

