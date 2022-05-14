package com.baith2.service.impl;

import com.baith2.converter.ProductConverter;
import com.baith2.dto.ProductDTO;
import com.baith2.entity.ProductEntity;
import com.baith2.repository.ProductRepository;
import com.baith2.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductConverter productConverter;
    @Override
    public ProductDTO save(ProductDTO productDTO) {
        ProductEntity productEntity = new ProductEntity();
        productEntity = productConverter.toEntity(productDTO);
        productEntity = productRepository.save(productEntity);
        return productConverter.toDTO(productEntity);
    }

    @Override
    public List<ProductEntity> getAll() {
        List<ProductEntity> entities = productRepository.findAll();
        return entities;
    }

    @Override
    public ProductEntity getById(String code) {
        return productRepository.findProductEntityByCode(code);
    }

    @Override
    public void delete(String[] codes) {
        for (String code: codes){
            productRepository.delete(code);
        }
    }

}
