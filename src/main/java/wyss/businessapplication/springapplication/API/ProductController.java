package wyss.businessapplication.springapplication.API;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import wyss.businessapplication.springapplication.Database.Product;
import wyss.businessapplication.springapplication.services.ProductService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(ProductController.BASE_URL)
public class ProductController {

    public static final String BASE_URL = "/wyss/product";

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    List<Product> getAllProducts() {
        return productService.findallProducts();
    }

    @GetMapping("/{id}")
    public Product getProductsById(@PathVariable Long id) {
        return productService.findProductByID(id);
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
}