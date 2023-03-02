package devkaimovies.MoviesAPI;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired // auto connect the service to this class instead of constructor
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

//    With ObjectId
//    public Optional<Movie> movieById(ObjectId id){
//        return movieRepository.findById(id);
//    }

//    With ImbdId
//    here we can use string as we dont need to send ObjectId to the repository
//    its a custom findBy method with String parameter
    public Optional<Movie> movieById(String movieId){
        return movieRepository.findMovieByImdbId(movieId);
    }


}
