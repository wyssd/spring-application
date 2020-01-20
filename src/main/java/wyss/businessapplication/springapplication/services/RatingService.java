package wyss.businessapplication.springapplication.services;

import wyss.businessapplication.springapplication.Database.Rating;

import java.util.List;

public interface RatingService {

    Rating findRatingByID(Long id);

    List<Rating> findallRatings();

    Rating saveRating(Rating rating);

}
