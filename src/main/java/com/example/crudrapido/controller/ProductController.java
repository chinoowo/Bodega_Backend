package com.example.crudrapido.controller;

import com.example.crudrapido.entity.Product;
import com.example.crudrapido.entity.SolicitudAprobacionDespacho;
import com.example.crudrapido.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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










    public static class RespuestaSolicitud {

        public void enviarSolicitudAprobacionDespacho(String codigoSeguimiento, String direccion, String producto, int cantidad) {
            String url = "https://musicpro.bemtorres.win/api/v1/musicpro/send_email";

            // Crear el objeto RestTemplate
            RestTemplate restTemplate = new RestTemplate();

            // Crear los encabezados de la solicitud
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            // Crear el objeto con los parámetros de la solicitud
            SolicitudAprobacionDespacho solicitud = new SolicitudAprobacionDespacho(codigoSeguimiento, direccion, producto, cantidad);

            // Crear la entidad de la solicitud con los encabezados y parámetros
            HttpEntity<SolicitudAprobacionDespacho> requestEntity = new HttpEntity<>(solicitud, headers);

            // Enviar la solicitud POST y obtener la respuesta
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);

            // Obtener el código de respuesta HTTP
            int statusCode = responseEntity.getStatusCodeValue();

        }
    }


    @RestController
    public class SolicitudController {

        @PostMapping("/enviar-solicitud")
        public void enviarSolicitudAprobacionDespacho(@RequestBody SolicitudAprobacionDespacho solicitud) {
            String codigoSeguimiento = solicitud.getCodigoSeguimiento();
            String direccion = solicitud.getDireccion();
            String producto = solicitud.getProducto();
            int cantidad = solicitud.getCantidad();

            // Realiza cualquier otra lógica necesaria antes de enviar la solicitud
            // ...

            // Llama al método para enviar la solicitud de aprobación de despacho
            RespuestaSolicitud respuestaSolicitud = new RespuestaSolicitud();
            respuestaSolicitud.enviarSolicitudAprobacionDespacho(codigoSeguimiento, direccion, producto, cantidad);
        }
    }




}


