package com.franlops.market.persistence;

import com.franlops.market.persistence.crud.ProductoCrudRepository;
import com.franlops.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
