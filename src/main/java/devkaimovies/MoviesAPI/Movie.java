package devkaimovies.MoviesAPI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")  // connects to mongo collection with the name movies
@Data // adding to the class all setters and getters for each property
@AllArgsConstructor // adding a constructor that accepting all this properties
@NoArgsConstructor // same as before but with no properties at all
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    @DocumentReference // it will take the reviews from the collection the review is in
    private List<Review> reviewIds;
}
