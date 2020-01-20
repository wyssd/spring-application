package wyss.businessapplication.springapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import wyss.businessapplication.springapplication.Database.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
