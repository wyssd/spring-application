package wyss.businessapplication.springapplication.API;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import wyss.businessapplication.springapplication.Database.Rating;
import wyss.businessapplication.springapplication.services.RatingService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(RatingController.BASE_URL)
public class RatingController {

    public static final String BASE_URL = "/wyss/rating";

    private final RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping
    List<Rating> getAllRatings() {
        return ratingService.findallRatings();
    }

    @GetMapping("/{id}")
    public Rating getRatingsById(@PathVariable Long id) {
        return ratingService.findRatingByID(id);
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Rating saveRatings(@RequestBody Rating rating) {
        return ratingService.saveRating(rating);
    }
}
