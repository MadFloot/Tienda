package com.tienda.service.impl;

import com.tienda.domain.Producto;
import com.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tienda.dao.ProductoDao;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    //La anotacion Autowired crea un unico objeto sin hacer new... y se mantiene
    @Autowired
    private ProductoDao categoriaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Producto> getCategorias(boolean activos) {
        var lista = categoriaDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Producto getCategoria(Producto categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Producto categoria) {
        categoriaDao.delete(categoria);
    }
        
    
}

    
        
    


