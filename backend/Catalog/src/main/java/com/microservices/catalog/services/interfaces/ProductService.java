package com.microservices.catalog.services.interfaces;

import com.microservices.catalog.models.Product;

import java.util.List;
import java.util.Optional;

// Elenco dei prodotti: GET /products
// Ottenere un prodotto tramite ID: GET /products/{id}
// Ricerca per categoria: GET /products/category/{category}
// Creare un prodotto: POST /products
// Modificare la disponibilità: PUT /products/{id}/availability/{value}

public interface ProductService {

    List<Product> getProducts();

    Optional<Product> getProductById(String id);

    Optional<Product> getProductByCode(String code);

    List<Product> getProductsByCategory(String category);

    Product createProduct(Product product);

    Product updateAvailability(String id, Integer availability);
}
