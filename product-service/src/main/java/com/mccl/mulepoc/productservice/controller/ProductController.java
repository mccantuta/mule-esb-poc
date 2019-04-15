package com.mccl.mulepoc.productservice.controller;

import com.mccl.mulepoc.productservice.dto.ProductDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("products")
public class ProductController {

    @GetMapping
    public ProductDTO getProduct() {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(3L);
        productDTO.setName("Screwdriver");

        return productDTO;
    }
}
