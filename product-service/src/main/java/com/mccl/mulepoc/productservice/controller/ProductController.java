package com.mccl.mulepoc.productservice.controller;

import com.mccl.mulepoc.productservice.dto.ProductDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/{id}")
    public ProductDTO getProduct(@PathVariable("id") Long id) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(id);
        productDTO.setName("Screwdriver");

        return productDTO;
    }
}
