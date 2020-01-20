package wyss.businessapplication.springapplication.services;

import wyss.businessapplication.springapplication.Database.Product;

import java.util.List;

public interface ProductService {

    Product findProductByID(Long id);

    List<Product> findallProducts();

    Product saveProduct(Product product);

}
