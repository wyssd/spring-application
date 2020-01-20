package wyss.businessapplication.springapplication.UselessStart;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import wyss.businessapplication.springapplication.Database.Customer;
import wyss.businessapplication.springapplication.Database.Product;
import wyss.businessapplication.springapplication.Database.Rating;
import wyss.businessapplication.springapplication.repositories.CustomerRepository;
import wyss.businessapplication.springapplication.repositories.ProductRepository;
import wyss.businessapplication.springapplication.repositories.RatingRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;
    private final RatingRepository ratingRepository;

    public BootStrapData(CustomerRepository customerRepository, ProductRepository productRepository, RatingRepository ratingRepository) {
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
        this.ratingRepository = ratingRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("loading Customer Data");

        Customer c1 = new Customer();
        c1.setFirstname("Michale");
        c1.setLastname("Weston");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstname("Sam");
        c2.setLastname("Axe");
        customerRepository.save(c2);

        Product p1 = new Product();
        p1.setName("Samsung NOTE 8");
        p1.setPrice("800.-");
        p1.setShortDescription("256GB, 4K, 25Mpx");
        p1.setDescription("Das Note ist super und hat ein Stift");
        p1.setSpecification("Es besitzt einen Speicher von 256Gb und kann auf bis 1T erweitert werden");
        p1.setStars(4);

        Product p2 = new Product();
        p2.setName("Iphone 11 Pro");
        p2.setPrice("2300.-");
        p2.setShortDescription("46GB, 480p, 2Mpx");
        p2.setDescription("Überteuerstes Iphone 11 Pro das genau so ist wie das normale 11. Hat nicht viel speicher was dich zwingt unsere Cloud zu benutzen");
        p2.setSpecification("Grösse ist 8Zoll, Die Kammere kann bis auf 5Meter genau Bilder machen");
        p2.setStars(2);

        Rating r1 = new Rating();
        r1.setStars(5);
        r1.setTitle("Super Handy");
        r1.setText("das handy kann ich nur weiter empfehlen.");
        r1.setThumbUp(15);
        r1.setThumbDown(2);
        ratingRepository.save(r1);

        Rating r2 = new Rating();
        r2.setStars(3);
        r2.setTitle("Stift geht kaput");
        r2.setText("Das Handy ist soweit super aber der Stift fällt bei mir immer raus und auch der Lack geht immer mehr ab. Hab den stift auch schon fast mal verloren");
        r2.setThumbUp(26);
        r2.setThumbDown(5);
        ratingRepository.save(r2);

        List<Rating> ratings = new ArrayList();
        ratings.add(r1);
        ratings.add(r2);

        p1.setVotes(ratings);
        productRepository.save(p1);
        productRepository.save(p2);

    }
}
