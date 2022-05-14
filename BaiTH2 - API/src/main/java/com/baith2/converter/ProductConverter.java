package com.baith2.converter;


import com.baith2.dto.ProductDTO;
import com.baith2.entity.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {


    public ProductEntity toEntity(ProductDTO dto){
        ProductEntity entity = new ProductEntity();
        entity.setCode(dto.getCode());
        entity.setDescription(dto.getDescription());
        entity.setPrice(dto.getPrice());
        return entity;
    }

    public ProductDTO toDTO(ProductEntity entity){
        ProductDTO dto = new ProductDTO();
        dto.setCode(entity.getCode());
        dto.setDescription(entity.getDescription());
        dto.setPrice(entity.getPrice());
        return dto;
    }
    public ProductEntity toEntity(ProductDTO dto, ProductEntity entity){
        entity.setCode(dto.getCode());
        entity.setDescription(dto.getDescription());
        entity.setPrice(entity.getPrice());
        return entity;
    }
}
