package devkaimovies.MoviesAPI;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;
    @GetMapping
//    public String allMovies(){
//        return "All movies";
//    }
    public ResponseEntity<List<Movie>> getAllMovies(){
//        return new ResponseEntity<String>("All movies", HttpStatus.OK);
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{id}") // here you can name it as you want
//    public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable ObjectId id){ // ObjectId must have its name id cannot be movie id
//        return new ResponseEntity<Optional<Movie>>(movieService.movieById(id) , HttpStatus.OK);
//    }
    public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable String id){ // ObjectId must have its name id cannot be movie id
        return new ResponseEntity<Optional<Movie>>(movieService.movieById(id) , HttpStatus.OK);
    }
}
