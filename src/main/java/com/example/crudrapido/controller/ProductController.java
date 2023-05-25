package com.example.crudrapido.controller;

import com.example.crudrapido.entity.Product;
import com.example.crudrapido.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import java.util.List;
import java.util.Optional;



@RestController

@RequestMapping(path = "api/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    public ProductController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    //Obtener datos de la lista
    @GetMapping()
    public List<Product> getAll(){
        return productService.getProducts();
    }


    //Obtener datos por id
    @GetMapping("/{productId}")
    public Optional<Product> getBId(@PathVariable("productId") Long productId){
        return productService.getProducts(productId);
    }

    //Guardar o actualizar datos
    @PostMapping("/{productId}")
    public Product saveUpdate(@RequestBody Product product){
        productService.saveOrUpdate(product);
        return product;
    }



    //Eliminar datos

    @DeleteMapping("/{productId}")
    public void saveUpdate(@PathVariable("productId") Long productId){
        productService.delete(productId);
    }





    private final RestTemplate restTemplate;
    @GetMapping("/api")
    public Object getApi(){
        String url = "https://musicpro.bemtorres.win/api/v1/test/saldo";
        Object forObject = restTemplate.getForObject(url, Object.class);
        return forObject;

    }


}


