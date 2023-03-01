package devkaimovies.MoviesAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired // auto connect the service to this class instead of constructor
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
return movieRepository.findAll();
    }
}
