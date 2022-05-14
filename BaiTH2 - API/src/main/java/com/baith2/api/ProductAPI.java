package com.baith2.api;

import com.baith2.dto.ProductDTO;
import com.baith2.entity.ProductEntity;
import com.baith2.service.IProductService;
import com.baith2.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class ProductAPI {

    @Autowired
    private IProductService productService;

    @PostMapping(value = "/product")
    public ProductDTO createProduct(@RequestBody ProductDTO model) {

        return productService.save(model);
    }

    @PostMapping(value = "/product/{code}")
        public ProductDTO updateProduct(@RequestBody ProductDTO model, @PathVariable("id") String code) {
        model.setCode(code);
        return productService.save(model);
    }

    @GetMapping(value = "/product")
    public List<ProductEntity> getAllProduct() {
        return productService.getAll();
    }

    @GetMapping(value = "/product/{code}")
    public ProductEntity getProduct(@RequestBody ProductDTO model, @PathVariable("code") String code) {
        return productService.getById(code);
    }

    @DeleteMapping(value = "/product")
    public void deleteProduct(@RequestBody String[] codes) {
        productService.delete(codes);
    }
}
