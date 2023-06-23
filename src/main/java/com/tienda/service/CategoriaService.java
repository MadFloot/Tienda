package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

public interface CategoriaService {
    //El siguiente metodo retorna una lista con las categorias
    //Que estan en la tabla categoria, todas o solo activas
    public List<Producto> getCategorias(boolean activos);
    
    //Aca siguen los metodos para hacer un CRUD de la tabla categoria
      // Se obtiene un Categoria, a partir del id de un categoria
    public Producto getCategoria(Producto categoria);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Producto categoria);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Producto categoria);
}



