package wyss.businessapplication.springapplication.services;

import org.springframework.stereotype.Service;
import wyss.businessapplication.springapplication.Database.Product;
import wyss.businessapplication.springapplication.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product findProductByID(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> findallProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

}
