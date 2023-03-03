package devkaimovies.MoviesAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;


//    making a new post request and getting from the body or the request and object then saying
//    inside there is a string type property and 1 more string type property and we call it payload (LIKE IN VUE!!! lol)
    @PostMapping
    public ResponseEntity<Review> addReview(@RequestBody Map<String, String> payload){
        return new ResponseEntity<Review>(reviewService.addReview(payload.get("reviewBody"),payload.get("imdbId")), HttpStatus.OK);
    }
}
