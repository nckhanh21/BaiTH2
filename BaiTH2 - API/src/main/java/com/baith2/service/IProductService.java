package com.baith2.service;


import com.baith2.dto.ProductDTO;
import com.baith2.entity.ProductEntity;

import java.util.List;

public interface IProductService{
    ProductDTO save(ProductDTO productDTO);
    List<ProductEntity> getAll();
    ProductEntity getById(String code);
    void delete(String[] codes);
}
