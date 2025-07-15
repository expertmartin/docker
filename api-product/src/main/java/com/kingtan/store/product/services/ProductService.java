package com.kingtan.store.product.services;

import com.kingtan.store.product.model.Product;
import com.kingtan.store.product.repository.ProductRepository;
import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private static final Logger log = LoggerFactory.getLogger(ProductService.class);
    ObservationRegistry observationRegistry = ObservationRegistry.create();
    Observation observation = Observation.createNotStarted("sample", observationRegistry);
    @Autowired
    private ProductRepository productRepository;
//
//    private final String data = "{\"products\": ["
//            + "{ \"id\": 1, \"name\": \"Kayak\", \"category\": \"Watersports\", \"description\": \"A boat for one person\", \"price\": 275 },"
//            + "{ \"id\": 2, \"name\": \"Lifejacket\", \"category\": \"Watersports\", \"description\": \"Protective and fashionable\", \"price\": 48.95 },"
//            + "{ \"id\": 3, \"name\": \"Soccer Ball\", \"category\": \"Soccer\", \"description\": \"FIFA-approved size and weight\", \"price\": 19.50 },"
//            + "{ \"id\": 4, \"name\": \"Corner Flags\", \"category\": \"Soccer\", \"description\": \"Give your playing field a professional touch\", \"price\": 34.95 },"
//            + "{ \"id\": 5, \"name\": \"Stadium\", \"category\": \"Soccer\", \"description\": \"Flat-packed 35,000-seat stadium\", \"price\": 79500 },"
//            + "{ \"id\": 6, \"name\": \"Thinking Cap\", \"category\": \"Chess\", \"description\": \"Improve brain efficiency by 75%\", \"price\": 16 },"
//            + "{ \"id\": 7, \"name\": \"Unsteady Chair\", \"category\": \"Chess\", \"description\": \"Secretly give your opponent a disadvantage\", \"price\": 29.95 },"
//            + "{ \"id\": 8, \"name\": \"Human Chess Board\", \"category\": \"Chess\", \"description\": \"A fun game for the family\", \"price\": 75 },"
//            + "{ \"id\": 9, \"name\": \"Bling Bling King\", \"category\": \"Chess\", \"description\": \"Gold-plated, diamond-studded King\", \"price\": 1200 }" + "]}";
//
//    private final List<Product> products;
//
//    public ProductService() throws IOException {
//        products = JsonUtil.getMapSLProduct(data).get("products");
//    }
//
//    public String getStoreDataStr() {
//        return data;
//    }
//
//    public JsonNode getStoreDataJson() throws IOException {
//        return JsonUtil.getJsonNodeFromString(data);
//    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product saveProduct(Product product) {
        log.info("saved?");
        return productRepository.save(product);
    }

}
