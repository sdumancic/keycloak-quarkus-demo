package com.example;

import javax.enterprise.context.ApplicationScoped;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class ProductsService {

     List<Product> products = new ArrayList<Product>(Arrays.asList(
            new Product(1, "IPAD 12.9", "1234-567", "Apple Ipad 12.9 128GB", BigDecimal.valueOf(1029.22)),
            new Product(2, "Samsung TV 55", "111567", "Samsung TV 55", BigDecimal.valueOf(1229.22)),
            new Product(3, "Keyboard A1", "1-567", "Some keyboard", BigDecimal.valueOf(122))
    ));

    public List<Product> getProducts() {
        return this.products;
    }
}
