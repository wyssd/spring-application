package wyss.businessapplication.springapplication.UselessStart;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import wyss.businessapplication.springapplication.Database.Product;
import wyss.businessapplication.springapplication.repositories.ProductRepository;
import wyss.businessapplication.springapplication.repositories.RatingRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final RatingRepository ratingRepository;

    public BootStrapData(ProductRepository productRepository, RatingRepository ratingRepository) {
        this.productRepository = productRepository;
        this.ratingRepository = ratingRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loding everthing shit");

        Product p1 = new Product();
        p1.setName("Samsung Note 8");
        p1.setPrice("800.-");
        p1.setShortDescription("256GB, 4K, 25Mpx");
        p1.setDescription("Das Note ist super und hat ein Stift");
        p1.setSpecification("Es besitzt einen Speicher von 256Gb und kann auf bis 1T erweitert werden");
        p1.setStars(4);
        productRepository.save(p1);

        Product p2 = new Product();
        p2.setName("Iphone 11 Pro");
        p2.setPrice("2300.-");
        p2.setShortDescription("46GB, 480p, 2Mpx");
        p2.setDescription("Überteuerstes Iphone 11 Pro das genau so ist wie das normale 11. Hat nicht viel speicher was dich zwingt unsere Cloud zu benutzen");
        p2.setSpecification("Grösse ist 8Zoll, Die Kammere kann bis auf 5Meter genau Bilder machen");
        p2.setStars(2);
        productRepository.save(p2);
    }
}
