package net.safedata.maven.intro.controller;

import net.safedata.maven.intro.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final ProductService productService;

    @Autowired
    public MainController(final ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/hello")
    public String hello() {
        return productService.getHelloMessage();
    }
}
