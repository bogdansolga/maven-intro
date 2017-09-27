package net.safedata.maven.intro.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductService.class);

    public String getHelloMessage() {
        return "Hello, Maven!";
    }
}
