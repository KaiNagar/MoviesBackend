package devkaimovies.MoviesAPI;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    // the repository can only be used with ObjectId that is why all ids must come as ObjectId and not String

    public Optional<Movie> findMovieByImdbId(String imdbId);
    // the mongo repository knows by itself to make a new findBy method by the parameter and by the method name
    // just like find by ID but for any kind of property you want as long as its unique!.
}
