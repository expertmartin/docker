package com.kingtan.store.product.controller;

import ch.qos.logback.classic.Level;
import com.kingtan.store.product.model.Product;
import com.kingtan.store.product.services.ProductService;
import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(maxAge = 3600, origins = "http://localhost:8080, http://localhost:3000", allowedHeaders = "*", methods = RequestMethod.GET)
@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RestController
@RequestMapping("/store")
public class ProductController {
    private static final ch.qos.logback.classic.Logger log = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(ProductController.class);
//    private static final Logger log = LoggerFactory.getLogger(ProductController.class);

    ObservationRegistry observationRegistry = ObservationRegistry.create();
    Observation observation = Observation.createNotStarted("sample", observationRegistry);
    @Autowired
    private ProductService service;

    //@CrossOrigin(maxAge = 3600, origins = "http://localhost:8080, http://localhost:3000", allowedHeaders = "*")
    @CrossOrigin(maxAge = 3600, origins = "*", allowedHeaders = "*")
    @GetMapping("/products")
    //@Async
    public List<Product> getProducts() {

        log.setLevel(Level.INFO);
        log.info("gt?");
        //log.info("Requester: {}, getFromDatabase(), products list:\n{}", a.getName(), service.getProducts());
        return service.getProducts();
    }

    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product) {
        log.info("saved?");
        return service.saveProduct(product);
    }
}
