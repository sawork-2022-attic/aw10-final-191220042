package com.micropos.product.service;

import com.micropos.product.model.Product;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public Flux<Product> products();

    public Optional<Product> getProduct(int id);

    public Product randomProduct();
}
