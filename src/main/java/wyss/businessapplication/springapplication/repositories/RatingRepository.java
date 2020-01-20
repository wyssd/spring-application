package wyss.businessapplication.springapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import wyss.businessapplication.springapplication.Database.Rating;

public interface RatingRepository extends JpaRepository<Rating, Long> {
}
