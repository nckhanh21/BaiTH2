package com.baith2.repository;

import com.baith2.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {
    ProductEntity findProductEntityByCode(String code);
    void deleteProductEntityByCode(String code);


}
