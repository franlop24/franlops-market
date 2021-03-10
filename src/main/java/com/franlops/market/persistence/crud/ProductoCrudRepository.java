package com.franlops.market.persistence.crud;

import com.franlops.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository  extends CrudRepository<Producto, Integer> {
}
