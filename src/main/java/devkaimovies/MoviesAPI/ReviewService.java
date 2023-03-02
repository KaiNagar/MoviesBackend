package devkaimovies.MoviesAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    // when you need to do something really complex or there is just no use inside the repository
    // we are going to use the template of mongo
    @Autowired
    private MongoTemplate mongoTemplate;
    public Review addReview(String reviewBody, String imdbId){
        Review review = new Review(reviewBody);
        reviewRepository.insert(review); //auto pushing it to the mongo database

//        insert return us the new object we just pushed so we can write it like this
//        Review review =  reviewRepository.insert(review);

//        THIS IS AGGREGATION!!! DONT BE SCARED IT S KIND OF FUN IF YOU THINK ABOUT IT!!
        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))// finding the right movie to update
                .apply(new Update().push("reviewIds").value(review))
                // making a new update, selecting where topush it, and what to push into it
                .first(); // making sure we are doing it to the first movie we find so there wont be dups
        System.out.println(review);
        return review;
    }
}
