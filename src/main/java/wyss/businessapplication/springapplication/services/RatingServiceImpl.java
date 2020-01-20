package wyss.businessapplication.springapplication.services;

import org.springframework.stereotype.Service;
import wyss.businessapplication.springapplication.Database.Rating;
import wyss.businessapplication.springapplication.repositories.RatingRepository;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService{

    private final RatingRepository ratingRepository;

    public RatingServiceImpl(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    @Override
    public Rating findRatingByID(Long id) {
        return ratingRepository.findById(id).get();
    }

    @Override
    public List<Rating> findallRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public Rating saveRating(Rating rating) {
        return ratingRepository.save(rating);
    }

}
